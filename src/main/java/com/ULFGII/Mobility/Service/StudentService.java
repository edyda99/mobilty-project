package com.ULFGII.Mobility.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ULFGII.Mobility.DAO.StudentRepo;
import com.ULFGII.Mobility.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;

	public void delete(int id) {
		studentRepo.deleteById(id);
	}

	public List<Student> getAll() {
		return studentRepo.findAll();
	}

	public Student getById(int id) {
		return studentRepo.findById(id).get();
	}

	public void save(Student student) {
		studentRepo.save(student);
	}

}
