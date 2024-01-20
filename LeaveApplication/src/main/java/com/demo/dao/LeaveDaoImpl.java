package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.demo.model.LeaveDetails;



@Repository
public class LeaveDaoImpl implements LeaveDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public void addDetails(LeaveDetails ld) {
		
		String str = "insert into leavedetails (leave_applied_on, start_date, end_date, leave_type, leave_reason,empno) values(?,?,?,?,?,?)";
		jdbcTemplate.update(str, new Object[] {
				
			ld.getLeave_applied_on(),ld.getStart_date(),ld.getEnd_date(),ld.getLeave_type(),ld.getLeave_reason(),ld.getEmpno()	
		});
	}


	public List<LeaveDetails> showDetails() {
		
		return jdbcTemplate.query("select * from leavedetails", (rs,num)->
		{
			LeaveDetails ld = new LeaveDetails();
			ld.setLeave_id(rs.getInt(1));
			ld.setLeave_applied_on(rs.getString(2));
			ld.setStart_date(rs.getString(3));
			ld.setEnd_date(rs.getString(4));
			ld.setLeave_type(rs.getString(5));
			ld.setLeave_reason(rs.getString(6));
			ld.setEmpno(rs.getInt(7));
			
			return ld;

		});
	}

}

