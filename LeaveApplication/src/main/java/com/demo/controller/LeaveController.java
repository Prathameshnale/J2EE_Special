package com.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.LeaveDetails;
import com.demo.service.LeaveService;

@Controller
@RequestMapping("/")
public class LeaveController {

	@Autowired
	private LeaveService lservice;
	
	@GetMapping("/index")
	public String showhomepage()
	{
		return "index";
		
	}
	
	@GetMapping("/applyleave")
	public String showLeaveForm()
	{
		return "leaveform";
		
	}
	
	@GetMapping("/getdetails")
	public ModelAndView diplayDetails() {
		
			List<LeaveDetails> dlist=lservice.diplayDetails();
			return new ModelAndView("displaydeatils","dlist",dlist);
	}
	
	@PostMapping("/insertdetails")
	public ModelAndView insertDetails(@RequestParam String start_date,@RequestParam String end_date,@RequestParam String leave_type, @RequestParam String leave_reason,@RequestParam int empno)
	{
		String cd = "2024-01-20";
		LeaveDetails ld = new LeaveDetails(cd,start_date,end_date,leave_type,leave_reason,empno);
		
		lservice.insertDetails(ld);
		return new ModelAndView("redirect:/getdetails");
		
	}
	

	
}
