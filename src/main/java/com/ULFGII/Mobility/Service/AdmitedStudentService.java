package com.ULFGII.Mobility.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ULFGII.Mobility.DAO.AdmitedStudentRepo;
import com.ULFGII.Mobility.Entity.AdmitedStudent;

@Service
public class AdmitedStudentService {
	@Autowired
	private AdmitedStudentRepo admitedStudentRepo;

	public void delete(int id) {
		admitedStudentRepo.deleteById(id);
	}

	public List<AdmitedStudent> getAll() {
		return admitedStudentRepo.findAll();
	}

	public AdmitedStudent getById(int id) {
		return admitedStudentRepo.findById(id).get();
	}

	public void save(AdmitedStudent admitedStudent) {
		admitedStudentRepo.save(admitedStudent);
	}

}
