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

import com.ULFGII.Mobility.Entity.Scholarship;
import com.ULFGII.Mobility.Service.ScholarshipService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ScholarshipController {

	@Autowired
	private ScholarshipService scholarshipService;

	@RequestMapping(value = "/scholarship", method = RequestMethod.POST)
	public ResponseEntity<?> postscholarship(@RequestBody Scholarship scholarship) {

		scholarshipService.save(scholarship);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/scholarship", method = RequestMethod.PUT)
	public ResponseEntity<?> putscholarship(@RequestBody Scholarship scholarship) {

		scholarshipService.save(scholarship);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/scholarships", method = RequestMethod.GET)
	public ResponseEntity<?> getscholarship() {
		return new ResponseEntity<>(scholarshipService.getAll(), HttpStatus.OK);

	}

	@RequestMapping(value = "/scholarship", method = RequestMethod.GET)
	public ResponseEntity<?> getscholarshipByID(@RequestParam int scholarship_id) {

		return new ResponseEntity<>(scholarshipService.getById(scholarship_id), HttpStatus.OK);

	}

	@RequestMapping(value = "/scholarship", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletescholarship(@RequestParam int scholarship_id) {
		scholarshipService.delete(scholarship_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
