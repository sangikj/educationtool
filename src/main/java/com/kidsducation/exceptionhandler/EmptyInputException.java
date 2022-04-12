package com.kidsducation.exceptionhandler;

public class EmptyInputException extends Exception {
private static final long serialVersionUID = 1L;
	public EmptyInputException() {
		super();
	}
	String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmptyInputException(String message) {
		super(message);
		this.message=message;
	}
}
