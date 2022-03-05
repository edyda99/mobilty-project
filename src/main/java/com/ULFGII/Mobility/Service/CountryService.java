package com.ULFGII.Mobility.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ULFGII.Mobility.DAO.ContryRepo;
import com.ULFGII.Mobility.Entity.Country;

public class CountryService {

	@Autowired
	private ContryRepo countryRepo;

	public void delete(int id) {
		countryRepo.deleteById(id);
	}

	public List<Country> getAll() {
		return countryRepo.findAll();
	}

	public Country getById(int id) {
		return countryRepo.findById(id).get();
	}

	public void save(Country country) {
		countryRepo.save(country);
	}
}
