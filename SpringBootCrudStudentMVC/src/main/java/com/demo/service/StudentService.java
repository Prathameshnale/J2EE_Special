package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	List<Student> getStudents();

	void addStudent(Student s);

	void deleteById(int sid);

	Student getStudent(int sid);

	void updateNewStudent(Student s);

}
