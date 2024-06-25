package com.MapTable.MappingTable.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MapTable.MappingTable.Dto.PostResponse;
import com.MapTable.MappingTable.Entity.Employee;
import com.MapTable.MappingTable.Service.EmployeeService;
import com.MapTable.MappingTable.util.AppContants;
@RestController
@RequestMapping("/map")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeservice;

	public EmployeeController(EmployeeService employeeservice) 
	{
		this.employeeservice = employeeservice;
	}
	
	@PostMapping("/saveemployee")
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		Employee saveemployee=employeeservice.saveEmloyee(employee);
		return saveemployee;
	}
	
	
	@GetMapping("/getid/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") long id)
	{
		Employee getemployee=employeeservice.getEmployee(id);
		return ResponseEntity.ok(getemployee);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Employee>> getAllEmployee()
	{
		List<Employee> list=employeeservice.getAllEmployee();
		return ResponseEntity.ok(list);
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable("id") long id, @RequestBody Employee employeeupdate)
	{
		return employeeservice.updateEmployee(id, employeeupdate);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") long id)
	{
		return employeeservice.deleteEmployee(id);
	}
	
	@GetMapping("/getallemployee")
	public PostResponse getallemployee(
			@RequestParam(name="pageNo",required=false,defaultValue=AppContants.PAGE_NO) int pageNo,
			@RequestParam(name="pageSize",required=false,defaultValue=AppContants.PAGE_SIZE) int pageSize,
	        @RequestParam(name="sortBy",required=false,defaultValue=AppContants.SORT_BY) String sortBy,
	        @RequestParam(name="sortDir",required=false,defaultValue=AppContants.SORT_DIR) String sortDir)
	{
		PostResponse getemployees=employeeservice.getallemployee(pageNo,pageSize,sortBy,sortDir);
		return getemployees;
	}	
}
