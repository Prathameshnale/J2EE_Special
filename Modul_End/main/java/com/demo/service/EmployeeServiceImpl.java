package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeDao edao;

	@Override
	public void addLeave(Employee employee) {
		
		edao.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return edao.findAll();
	}



}
