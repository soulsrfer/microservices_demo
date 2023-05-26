package com.google.Exceptions;

public class ResourseNotFoundException extends RuntimeException{
	public ResourseNotFoundException() {
		super("Resource Not Found On Server!!");
	}
	
	public ResourseNotFoundException(String message) {
		super(message);
	}
}
