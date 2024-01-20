package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LeaveDao;
import com.demo.model.LeaveDetails;

@Service
public class LeaveServiceImpl implements LeaveService{
	
	@Autowired
	private LeaveDao ldao;

	public void insertDetails(LeaveDetails ld) {
		
		ldao.addDetails(ld);
		
	}

	public List<LeaveDetails> diplayDetails() {
		
		return ldao.showDetails();
	}
	

}
