package com.MapTable.MappingTable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.MapTable.MappingTable.Entity.Address;
import com.MapTable.MappingTable.Entity.Employee;
import com.MapTable.MappingTable.Repository.EmployeeRepository;

@SpringBootTest
public class OneToOneTest 
{
	@Autowired
     private EmployeeRepository employeerepository;
	
//	@Test
//	public void saveEmployee()
//	{
//		Employee e=new Employee();
//		e.setName("deva");
//		e.setAge("30");
//		e.setDepartment("html");
//		
//		Address a=new Address();
//		a.setStreet("eaststreet");
//		a.setCity("karur");
//		a.setState("tamilnadu");
//		
//		e.setAddress(a);
//		employeerepository.save(e);
//	}
	
//	@Test
//	public void getEmployee()
//	{
//		Employee employee=employeerepository.findById(2l).get();
//		System.out.println(employee.getName());
//		System.out.println(employee.getId());
//		System.out.println(employee.getAge());
//		System.out.println(employee.getDepartment());
//		
//		System.out.println(employee.getAddress().getStreet());
//		System.out.println(employee.getAddress().getCity());
//		System.out.println(employee.getAddress().getState());
//	}
	
//	@Test
//	public void updateEmployee()
//	{
//		Employee employee=employeerepository.findById(2l).get();
//		employee.setDepartment("mysql");
//		employee.getAddress().setState("madhya-pradesh");
//		
//		employeerepository.save(employee);
//	}
	
//	@Test
//	public void deleteEmployee()
//	{
//		Employee employee=employeerepository.findById(2l).get();
//		employeerepository.delete(employee);
//	}
}
