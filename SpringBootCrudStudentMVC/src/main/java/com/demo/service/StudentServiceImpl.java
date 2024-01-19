package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sdao;
	
	
	
	@Override
	public List<Student> getStudents() {
		
		return sdao.findAll();
	}



	@Override
	public void addStudent(Student s) {
		
		sdao.save(s);
		
	}



	@Override
	public void deleteById(int sid) {
		
		sdao.deleteById(sid);
		
	}



	@Override
	public Student getStudent(int sid) {
		
		return sdao.getById(sid);
	}



	@Override
	public void updateNewStudent(Student s) {
		
		Student ns =sdao.getById(s.getSid());
		ns.setSid(s.getSid());
		ns.setSname(s.getSname());
		ns.setMarks(s.getMarks());
		
		sdao.save(ns);
		
	}

}
