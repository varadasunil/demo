package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studList")
	
	public List<Student> getStudents() {
		
		return studentService.getStudentList();
		
	}
	@GetMapping("/student/{id}")
	
	public Student getStudentByID(@PathVariable("id") Long id){
		
		return studentService.getStudentByID(id);
		
		
	}
	
		@PostMapping("/student")
		public Student createStudent(@RequestBody Student stud) {
			
			return studentService.createstudent(stud);
		}
		
		@PutMapping("/student/{id}")
		public Student createStudent(@PathVariable("id")Long id, @RequestBody Student stud) {
			
			return studentService.updatestudent(id,stud);
		}
		@DeleteMapping("/deleteStud/{id}")
		public void deleteStudent(@PathVariable("id")Long id) {			
			studentService.deleteStudent(id);
			
		}
}
