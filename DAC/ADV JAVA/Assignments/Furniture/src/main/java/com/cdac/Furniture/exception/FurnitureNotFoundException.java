package com.cdac.Furniture.exception;

public class FurnitureNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FurnitureNotFoundException(String message) {
		super(message);
	}
}
