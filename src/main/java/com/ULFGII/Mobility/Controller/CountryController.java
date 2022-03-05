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

import com.ULFGII.Mobility.Entity.Country;
import com.ULFGII.Mobility.Service.CountryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CountryController {
	@Autowired
	private CountryService countryService;
	

	@RequestMapping(value = "/country", method = RequestMethod.POST)
	public ResponseEntity<?> postcountry(@RequestBody Country country) {
 
		countryService.save(country);
			return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/country", method = RequestMethod.PUT)
	public ResponseEntity<?> putcountry(@RequestBody Country country) {
 
		countryService.save(country);
			return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/countrys", method = RequestMethod.GET)
	public  ResponseEntity<?> getcountry() {
		return new ResponseEntity<>(countryService.getAll(),HttpStatus.OK);

	}

	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public ResponseEntity<?> getcountryByID(@RequestParam int country_id) {

		return new ResponseEntity<>(countryService.getById(country_id),HttpStatus.OK);

	}

	@RequestMapping(value = "/country", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletecountry(@RequestParam int country_id) {
		countryService.delete(country_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
