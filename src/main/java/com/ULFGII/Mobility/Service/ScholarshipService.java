package com.ULFGII.Mobility.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ULFGII.Mobility.DAO.ScholarshipRepo;
import com.ULFGII.Mobility.Entity.Scholarship;

@Service
public class ScholarshipService {
	@Autowired
	private ScholarshipRepo scholarshipRepo;

	public void delete(int id) {
		scholarshipRepo.deleteById(id);
	}

	public List<Scholarship> getAll() {
		return scholarshipRepo.findAll();
	}

	public Scholarship getById(int id) {
		return scholarshipRepo.findById(id).get();
	}

	public void save(Scholarship scholarship) {
		scholarshipRepo.save(scholarship);
	}
}
