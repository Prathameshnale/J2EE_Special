package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void deletebyId(int eid);

	void addNewEmp(Employee employee);

	Employee editById(int eid);

	void updateNewEmp(Employee employee);

}
