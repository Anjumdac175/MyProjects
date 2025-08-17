package com.cdac.HospitalManagment.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExeptionHandler {

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElement(){
		return new ResponseEntity<String>("Resource Not Found",HttpStatus.NOT_FOUND);
	}
}
