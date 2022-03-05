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

import com.ULFGII.Mobility.Entity.University;
import com.ULFGII.Mobility.Service.UniversityService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UniversityController {

	@Autowired
	private UniversityService universityService;

	@RequestMapping(value = "/university", method = RequestMethod.POST)
	public ResponseEntity<?> postuniversity(@RequestBody University university) {

		universityService.save(university);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/university", method = RequestMethod.PUT)
	public ResponseEntity<?> putuniversity(@RequestBody University university) {

		universityService.save(university);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/universities", method = RequestMethod.GET)
	public ResponseEntity<?> getuniversity() {
		return new ResponseEntity<>(universityService.getAll(), HttpStatus.OK);

	}

	@RequestMapping(value = "/university", method = RequestMethod.GET)
	public ResponseEntity<?> getuniversityByID(@RequestParam int university_id) {

		return new ResponseEntity<>(universityService.getById(university_id), HttpStatus.OK);

	}

	@RequestMapping(value = "/university", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteuniversity(@RequestParam int university_id) {
		universityService.delete(university_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
