package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.model.Employee;
import com.learning.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> get(){
		return employeeService.get();
	}
	
	@PostMapping("/employee")
	public void save(@RequestBody Employee employee) {
		employeeService.save(employee);
	}
	
	@GetMapping("/employee/{id}")
	public Employee get(@PathVariable int id) {
		return employeeService.get(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public void delete(@PathVariable int id) {
		 employeeService.delete(id);
	}
}
