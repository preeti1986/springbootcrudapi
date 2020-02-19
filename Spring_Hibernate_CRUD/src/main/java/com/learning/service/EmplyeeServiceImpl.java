package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.dao.EmployeeDAO;
import com.learning.model.Employee;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;
	
	@Override
	@Transactional
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return employeeDao.get();
	}

	@Override
	@Transactional
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return employeeDao.get(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeDao.delete(id);
	}

}
