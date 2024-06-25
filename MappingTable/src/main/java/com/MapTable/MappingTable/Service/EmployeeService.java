package com.MapTable.MappingTable.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.MapTable.MappingTable.Dto.PostResponse;
import com.MapTable.MappingTable.Entity.Employee;
import com.MapTable.MappingTable.Exception.EmployeeNotFoundException;
import com.MapTable.MappingTable.Repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired  
     private EmployeeRepository employeerepository;

	public EmployeeService(EmployeeRepository employeerepository) 
	{
		this.employeerepository = employeerepository;
	}
	
	public Employee saveEmloyee(Employee employee)
	{
		Employee saveemployee=employeerepository.save(employee);
		return saveemployee;
	}
	
	public Employee getEmployee(long id)
	{
		Employee getemployee=employeerepository.findById(id)
				.orElseThrow(()->new EmployeeNotFoundException("employee","id"));
		return getemployee;
	}
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> getallemployee=employeerepository.findAll();
		if(getallemployee.isEmpty())
		{
			throw new EmployeeNotFoundException("employee","database");
		}
		return getallemployee;
	}
	
	public Employee updateEmployee(long id,Employee employeeupdate)
	{
		Employee updateemployee=employeerepository.findById(id).get();
		updateemployee.setName(employeeupdate.getName());
		updateemployee.setDepartment(employeeupdate.getDepartment());
		updateemployee.setAge(employeeupdate.getAge());
		updateemployee.getAddress().setStreet(employeeupdate.getAddress().getStreet());
		updateemployee.getAddress().setCity(employeeupdate.getAddress().getCity());
		updateemployee.getAddress().setState(employeeupdate.getAddress().getState());
		return employeerepository.save(updateemployee);
		
	}
	
	public String deleteEmployee(long id)
	{
		Employee deleteemployee=employeerepository.findById(id).get();
		employeerepository.delete(deleteemployee);
		return "DELETE SUCCESSFULLY.....";
	}	
	
	public PostResponse getallemployee(int pageNo,int pageSize,String sortBy,String sortDir)
	{
		Sort sort=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?Sort.by(sortBy).ascending():
			  Sort.by(sortBy).descending();
		 Pageable pageable=PageRequest.of(pageNo, pageSize,sort);
		  Page<Employee> page=employeerepository.findAll(pageable);
		  List<Employee> listofemployee=page.getContent();
		  PostResponse post=new PostResponse();
		  post.setContent(listofemployee);
		  post.setPageNo(page.getNumber());
		  post.setPageSize(page.getSize());
		  post.setTotalElements(page.getTotalElements());
		  post.setTotalPages(page.getTotalPages());
		  post.setLast(page.isLast());
		  return post;
	}
}
