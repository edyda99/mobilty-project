package com.ULFGII.Mobility.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ULFGII.Mobility.DAO.MasterRepo;
import com.ULFGII.Mobility.Entity.Master;

@Service
public class MasterService {

	@Autowired
	private MasterRepo masterRepo;

	public void delete(int id) {
		masterRepo.deleteById(id);
	}

	public List<Master> getAll() {
		return masterRepo.findAll();
	}

	public Master getById(int id) {
		return masterRepo.findById(id).get();
	}

	public void save(Master master) {
		masterRepo.save(master);
	}
}
