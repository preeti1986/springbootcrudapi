package com.learning.service;

import java.util.List;

import com.learning.model.Employee;

public interface EmployeeService {

List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);

	void update(Employee employee);
}
