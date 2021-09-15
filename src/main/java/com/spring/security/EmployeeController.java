package com.spring.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/string")
	public String disp()
	{
		return "hello";
	}
	
	@PostMapping("/save/emp")
	public Employee saveEmp(@RequestBody Employee emp)
	{
		
	    return service.saveEmployee(emp);	
	}
	
	@PostMapping("/save")
	public String saveString()
	{
	    return "hello";
	}
	
	
	@GetMapping("/getEmp")
	public List<Employee> getEmp()
	{
		return service.getEmp();
	}
}
