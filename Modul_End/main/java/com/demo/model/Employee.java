package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leavedetails")
public class Employee {
	
	@Id
	private int leave_id;
	private String start_date;
	private String end_date;
	private String leave_type;
	private String leave_reason;
	private int emp_no;
	
	
	
	public Employee() {
		super();
	}
	
	
	
	public Employee(int leave_id, String start_date, String end_date, String leave_type, String leave_reason,
			int emp_no) {
		super();
		this.leave_id = leave_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.leave_type = leave_type;
		this.leave_reason = leave_reason;
		this.emp_no = emp_no;
	}
	
	
	
	public int getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}
	public String getLeave_reason() {
		return leave_reason;
	}
	public void setLeave_reason(String leave_reason) {
		this.leave_reason = leave_reason;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [leave_id=" + leave_id + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", leave_type=" + leave_type + ", leave_reason=" + leave_reason + ", emp_no=" + emp_no + "]";
	}
	
	
	

}
