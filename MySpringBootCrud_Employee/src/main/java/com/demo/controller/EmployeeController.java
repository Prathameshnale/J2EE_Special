package com.demo.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/getEmployees")
	public ModelAndView getAllEmployee(HttpSession session)
	{
		List<Employee> elist=eservice.getAllEmployees();
		return new ModelAndView("getAllEmp","elist",elist);
	}
	
	@GetMapping("/delete/{eid}")
	public ModelAndView deleteEmp(@PathVariable int eid)
	{
		eservice.deletebyId(eid);
		return new ModelAndView("redirect:/Employee/getEmployees");
	}
	
	@GetMapping("/addNewEmp")
	public String addnewEmp(HttpSession session)
	{
		return "insertNewEmp";
	}
	
	@PostMapping("addNewEmployee")
	public ModelAndView addNewEmploye(@RequestParam int eid,@RequestParam String ename,@RequestParam String email)
	{
		eservice.addNewEmp(new Employee(eid,ename,email));
		return new ModelAndView("redirect:/Employee/getEmployees");
	}
	
	@GetMapping("/edit/{eid}")
	public ModelAndView editEmp(@PathVariable int eid)
	{
		Employee e = eservice.editById(eid);
		return new ModelAndView("editEmployee","e",e);
	}
	
	@PostMapping("/updateEmployee")
	public ModelAndView updateNewEmployee(@RequestParam int eid,@RequestParam String ename,@RequestParam String email)
	{
		eservice.updateNewEmp(new Employee(eid,ename,email));
		return new ModelAndView("redirect:/Employee/getEmployees");
	}
}
















