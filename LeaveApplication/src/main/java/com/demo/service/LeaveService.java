package com.demo.service;

import java.util.List;

import com.demo.model.LeaveDetails;

public interface LeaveService {

	void insertDetails(LeaveDetails ld);

	List<LeaveDetails> diplayDetails();

}
