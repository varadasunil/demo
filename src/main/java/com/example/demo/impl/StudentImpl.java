package com.example.demo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentImpl implements StudentService{
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getStudentList() {
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentByID(Long id) {
		Optional<Student> stud=studentRepo.findById(id);
		if(stud.isPresent()) {
			return stud.get();
		}
		
		else throw new RuntimeException("id not found");
	}

	@Override
	public Student createstudent(Student stud) {
		
		return studentRepo.save(stud);
	}

	@Override
	public Student updatestudent(Long id,Student stud) {
		
		Student existingStudent= getStudentByID(id);
		existingStudent.setAge(stud.getAge() != null? stud.getAge():existingStudent.getAge());
		existingStudent.setGender(stud.getGender() != null? stud.getGender():existingStudent.getGender());
		existingStudent.setName(stud.getName() != null? stud.getName():existingStudent.getName());
		
		return studentRepo.save(existingStudent);
	
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
		
	}

}
