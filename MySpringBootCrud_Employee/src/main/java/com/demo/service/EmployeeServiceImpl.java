package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao edao;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return edao.findAll();
	}


	@Override
	public void deletebyId(int eid) {
		
		edao.deleteById(eid);
	}


	@Override
	public void addNewEmp(Employee employee) {
		
		edao.save(employee);
		
	}


	@Override
	public Employee editById(int eid) {
		
		return edao.getById(eid);
	}


	@Override
	public void updateNewEmp(Employee employee) {
		Employee e =edao.getById(employee.getEid());
		e.setEid(employee.getEid());
		e.setEname(employee.getEname());
		e.setEmail(employee.getEmail());
		edao.save(e);
		
	}

}
