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

import com.demo.model.Student;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private StudentService sservice;
	
	
	@GetMapping("/getStudents")
	public ModelAndView getAllStudents(HttpSession session)
	{
		List<Student> slist=sservice.getStudents();
		
		return new ModelAndView("displayStudent","slist",slist);
	}
	
	
	@GetMapping("/addNewStudent")
	public String addNew(HttpSession session)
	{
		return "insertStudent";
	}
	
	@PostMapping("/newStudent")
	public ModelAndView insertStudent(@RequestParam int sid,@RequestParam String sname,@RequestParam double marks)
	{
		Student s = new Student(sid,sname,marks);
		sservice.addStudent(s);
		
		return new ModelAndView("redirect:/Student/getStudents");
	}
	
	
	@GetMapping("/delete/{sid}")
	public ModelAndView deleteStudent(@PathVariable int sid)
	{
		sservice.deleteById(sid);
		
		return new ModelAndView("redirect:/Student/getStudents");
	}
	
	@GetMapping("/edit/{sid}")
	public ModelAndView editByID(@PathVariable int sid)
	{
		Student s = sservice.getStudent(sid);
		return new ModelAndView("editData","s",s);
	}
	
	
		@PostMapping("/updateStudent")
		public ModelAndView updateStudent(@RequestParam int sid,@RequestParam String sname,@RequestParam double marks)
		{
			Student s = new Student(sid,sname,marks);
			sservice.updateNewStudent(s);
			
			return new ModelAndView("redirect:/Student/getStudents");
		}
	
	
	

}
