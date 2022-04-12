package com.kidsducation.exceptionhandler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MissingPathVariableException;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
		
	@ExceptionHandler({EmptyInputException.class})
	public ResponseEntity<CustomErrorResponse> handleEmptyInput(EmptyInputException emptyInputException)
	{
		CustomErrorResponse customErrorResponse = new CustomErrorResponse();
		customErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		customErrorResponse.setMessage(emptyInputException.getMessage());
		customErrorResponse.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<CustomErrorResponse>(customErrorResponse,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({MissingPathVariableException.class})
	public ResponseEntity<CustomErrorResponse> MissingPathVariableException(MissingPathVariableException missingPathVariableException)
	{
		CustomErrorResponse customErrorResponse = new CustomErrorResponse();
		customErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		customErrorResponse.setMessage(missingPathVariableException.getMessage());
		customErrorResponse.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<CustomErrorResponse>(customErrorResponse,HttpStatus.BAD_REQUEST);
	}
	
	
	
	
}
