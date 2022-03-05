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

import com.ULFGII.Mobility.Entity.Student;
import com.ULFGII.Mobility.Service.StudentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public ResponseEntity<?> poststudent(@RequestBody Student student) {

		studentService.save(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/student", method = RequestMethod.PUT)
	public ResponseEntity<?> putstudent(@RequestBody Student student) {

		studentService.save(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ResponseEntity<?> getstudent() {
		return new ResponseEntity<>(studentService.getAll(), HttpStatus.OK);

	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ResponseEntity<?> getstudentByID(@RequestParam int student_id) {

		return new ResponseEntity<>(studentService.getById(student_id), HttpStatus.OK);

	}

	@RequestMapping(value = "/student", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletestudent(@RequestParam int student_id) {
		studentService.delete(student_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
