package com.ULFGII.Mobility.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ULFGII.Mobility.DAO.AuthorizedStudentRepo;
import com.ULFGII.Mobility.Entity.AuthorizedStudent;

@Service
public class AuthorizedStudentService {

	@Autowired
	private AuthorizedStudentRepo authorizedStudentRepo;

	public void delete(int id) {
		authorizedStudentRepo.deleteById(id);
	}

	public List<AuthorizedStudent> getAll() {
		return authorizedStudentRepo.findAll();
	}

	public AuthorizedStudent getById(int id) {
		return authorizedStudentRepo.findById(id).get();
	}

	public void save(AuthorizedStudent authorizedStudent) {
		authorizedStudentRepo.save(authorizedStudent);
	}
}
