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

import com.ULFGII.Mobility.Entity.AdmitedStudent;
import com.ULFGII.Mobility.Service.AdmitedStudentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AdmitedStudentController {
	@Autowired
	private AdmitedStudentService admitedStudentService;

	@RequestMapping(value = "/admitedStudent", method = RequestMethod.POST)
	public ResponseEntity<?> postadmitedStudent(@RequestBody AdmitedStudent admitedStudent) {

		admitedStudentService.save(admitedStudent);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/admitedStudent", method = RequestMethod.PUT)
	public ResponseEntity<?> putadmitedStudent(@RequestBody AdmitedStudent admitedStudent) {

		admitedStudentService.save(admitedStudent);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/admitedStudents", method = RequestMethod.GET)
	public ResponseEntity<?> getadmitedStudent() {
		return new ResponseEntity<>(admitedStudentService.getAll(), HttpStatus.OK);

	}

	@RequestMapping(value = "/admitedStudent", method = RequestMethod.GET)
	public ResponseEntity<?> getadmitedStudentByID(@RequestParam int admitedStudent_id) {

		return new ResponseEntity<>(admitedStudentService.getById(admitedStudent_id), HttpStatus.OK);

	}

	@RequestMapping(value = "/admitedStudent", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteadmitedStudent(@RequestParam int admitedStudent_id) {
		admitedStudentService.delete(admitedStudent_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
