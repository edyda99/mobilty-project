package com.ULFGII.Mobility.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ULFGII.Mobility.DAO.CityRepo;
import com.ULFGII.Mobility.Entity.City;

@Service
public class CityService {
	@Autowired
	private CityRepo cityRepo;

	public void delete(int id) {
		cityRepo.deleteById(id);
	}

	public List<City> getAll() {
		return cityRepo.findAll();
	}

	public City getById(int id) {
		return cityRepo.findById(id).get();
	}

	public void save(City city) {
		cityRepo.save(city);
	}
}
