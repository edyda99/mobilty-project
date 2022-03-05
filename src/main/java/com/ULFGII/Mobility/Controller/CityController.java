package com.ULFGII.Mobility.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ULFGII.Mobility.Entity.City;
import com.ULFGII.Mobility.Service.CityService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CityController {
	@Autowired
	private CityService cityService;

	@RequestMapping(value = "/city", method = RequestMethod.POST)
	public ResponseEntity<?> postcity(@RequestBody City city) {

		cityService.save(city);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/city", method = RequestMethod.PUT)
	public ResponseEntity<?> putcity(@RequestBody City city) {

		cityService.save(city);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/cities", method = RequestMethod.GET)
	public ResponseEntity<?> getcity() {
		return new ResponseEntity<>(cityService.getAll(), HttpStatus.OK);

	}

	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public ResponseEntity<?> getcityByID(@RequestParam int city_id) {

		return new ResponseEntity<>(cityService.getById(city_id), HttpStatus.OK);

	}

	@RequestMapping(value = "/city", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletecity(@RequestParam int city_id) {
		cityService.delete(city_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
