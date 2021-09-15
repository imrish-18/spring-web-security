package com.spring.security;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * The Class EmployeeService.
 */
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public Employee saveEmployee(Employee emp)
	{
		return repo.save(emp);
	}
	
	public List<Employee> getEmp()
	{
		return repo.findAll();
	}
	
}
