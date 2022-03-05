package com.ULFGII.Mobility.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ULFGII.Mobility.DAO.UniversityRepo;
import com.ULFGII.Mobility.Entity.University;

@Service
public class UniversityService {

	@Autowired
	private UniversityRepo universityRepo;

	public void delete(int id) {
		universityRepo.deleteById(id);
	}

	public List<University> getAll() {
		return universityRepo.findAll();
	}

	public University getById(int id) {
		return universityRepo.findById(id).get();
	}

	public void save(University university) {
		universityRepo.save(university);
	}
}
