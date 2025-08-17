package com.cdac.Furniture.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(FurnitureNotFoundException.class)
	public ResponseEntity<String> handleFurnitureNotFound(FurnitureNotFoundException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleOther(Exception e){
		return ResponseEntity.status(500).body("Something went wrong.. "+e.getMessage());
	}
	
}
