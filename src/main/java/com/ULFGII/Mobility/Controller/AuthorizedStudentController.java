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

import com.ULFGII.Mobility.Entity.AuthorizedStudent;
import com.ULFGII.Mobility.Service.AuthorizedStudentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AuthorizedStudentController {
	@Autowired
	private AuthorizedStudentService authorizedStudentService;

	@RequestMapping(value = "/authorizedStudent", method = RequestMethod.POST)
	public ResponseEntity<?> postauthorizedStudent(@RequestBody AuthorizedStudent authorizedStudent) {

		authorizedStudentService.save(authorizedStudent);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/authorizedStudent", method = RequestMethod.PUT)
	public ResponseEntity<?> putauthorizedStudent(@RequestBody AuthorizedStudent authorizedStudent) {

		authorizedStudentService.save(authorizedStudent);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/authorizedStudents", method = RequestMethod.GET)
	public ResponseEntity<?> getauthorizedStudent() {
		return new ResponseEntity<>(authorizedStudentService.getAll(), HttpStatus.OK);

	}

	@RequestMapping(value = "/authorizedStudent", method = RequestMethod.GET)
	public ResponseEntity<?> getauthorizedStudentByID(@RequestParam int authorizedStudent_id) {

		return new ResponseEntity<>(authorizedStudentService.getById(authorizedStudent_id), HttpStatus.OK);

	}

	@RequestMapping(value = "/authorizedStudent", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteauthorizedStudent(@RequestParam int authorizedStudent_id) {
		authorizedStudentService.delete(authorizedStudent_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
