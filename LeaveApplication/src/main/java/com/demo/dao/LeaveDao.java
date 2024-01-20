package com.demo.dao;

import java.util.List;

import com.demo.model.LeaveDetails;

public interface LeaveDao {

	void addDetails(LeaveDetails ld);

	List<LeaveDetails> showDetails();

}
