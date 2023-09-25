package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	List<Student> getStudentList();
	
	Student getStudentByID(Long id);
	
	Student createstudent(Student stud);
	
	Student updatestudent(Long id, Student stud);
	
	void deleteStudent(Long id);
	
	

}
