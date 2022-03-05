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

import com.ULFGII.Mobility.Entity.Master;
import com.ULFGII.Mobility.Service.MasterService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MasterController {
	@Autowired
	private MasterService masterService;

	@RequestMapping(value = "/master", method = RequestMethod.POST)
	public ResponseEntity<?> postmaster(@RequestBody Master master) {

		masterService.save(master);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/master", method = RequestMethod.PUT)
	public ResponseEntity<?> putmaster(@RequestBody Master master) {

		masterService.save(master);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/masters", method = RequestMethod.GET)
	public ResponseEntity<?> getmaster() {
		return new ResponseEntity<>(masterService.getAll(), HttpStatus.OK);

	}

	@RequestMapping(value = "/master", method = RequestMethod.GET)
	public ResponseEntity<?> getmasterByID(@RequestParam int master_id) {

		return new ResponseEntity<>(masterService.getById(master_id), HttpStatus.OK);

	}

	@RequestMapping(value = "/master", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletemaster(@RequestParam int master_id) {
		masterService.delete(master_id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
