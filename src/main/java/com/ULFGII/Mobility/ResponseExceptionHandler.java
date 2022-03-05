package com.ULFGII.Mobility;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@EnableWebMvc
@ControllerAdvice
public class ResponseExceptionHandler {

	ResponseEntity<?> responseEntity;
	Logger logger = LoggerFactory.getLogger(ResponseExceptionHandler.class);
	ResponseExceptionHandler() {
	}

	@ExceptionHandler(value = { NoSuchElementException.class })
	@ResponseBody
	protected ResponseEntity<?> handleConflict(RuntimeException ex, WebRequest request) {

		logger.error(ex.getMessage());
		return new ResponseEntity<>(ex.getMessage() ,HttpStatus.BAD_REQUEST);

	}
	@ExceptionHandler(value = { DataIntegrityViolationException.class })
	@ResponseBody
	protected ResponseEntity<?> dataConflict(RuntimeException ex, WebRequest request) {

		logger.error(ex.getMessage());
		return new ResponseEntity<>(ex.getMessage() ,HttpStatus.BAD_REQUEST);


	}
 
	@ExceptionHandler(value = { Exception.class, IllegalArgumentException.class, IllegalStateException.class })
	@ResponseBody
	protected ResponseEntity<?> handleAllConflict(RuntimeException ex, WebRequest request) {
 
		logger.error(ex.getMessage());
		return new ResponseEntity<>(ex.getMessage() ,HttpStatus.BAD_REQUEST);


	}
}
