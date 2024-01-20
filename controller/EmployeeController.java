package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@Controller
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService eservice;
	
	
	@GetMapping("/XYZ_page")
	public ModelAndView showPage(HttpSession session) {
		return new ModelAndView("companyPage");
	}
	
	@GetMapping("/Apply_Leave")
	public ModelAndView leavePage() {
		return new ModelAndView("employeeLeave");
	}
	
	@PostMapping("/saveLeave")
	public ModelAndView getData(@RequestParam int leave_id,@RequestParam String start_date,@RequestParam String end_date,@RequestParam String leave_type,@RequestParam String leave_reason,@RequestParam int emp_no) {
		eservice.addLeave(new Employee(leave_id,start_date,end_date,leave_type,leave_reason,emp_no));
		
		return new ModelAndView("redirect:/Employee/XYZ_page");
	}

}
