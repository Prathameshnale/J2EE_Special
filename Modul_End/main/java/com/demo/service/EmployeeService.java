package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	

	void addLeave(Employee employee);

	List<Employee> getAllEmployee();

}
