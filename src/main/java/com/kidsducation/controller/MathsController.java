package com.kidsducation.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kidsducation.exceptionhandler.EmptyInputException;

@RestController
public class MathsController {

	@GetMapping("/add/{a}/{b}")
	public int addition(@PathVariable int a,@PathVariable int b) {
	return a+b;
	}
	
	@GetMapping("/add/{a}")
	public int additionError(@PathVariable int a) throws EmptyInputException {
		throw new EmptyInputException("Input Parameter is missing");
}
	@GetMapping("/sub/{a}/{b}")
		public int substraction(@PathVariable int a,@PathVariable int b) {
	    return a-b;
	}
	@GetMapping("/sub/{a}/")
	public int substractionError(@PathVariable int a) throws EmptyInputException {
		throw new EmptyInputException("Input Parameter is missing");
}
	@GetMapping("/div/{a}/{b}")
		public int division(@PathVariable int a,@PathVariable int b) {
	    return a/b;
	}
	
	@GetMapping("/div/{a}/")
	public int divisionError(@PathVariable int a) throws EmptyInputException {
		throw new EmptyInputException("Input Parameter is missing");
}
	@GetMapping("/multi/{a}/{b}")
		public int multiplication(@PathVariable int a,@PathVariable int b) {
	    return a*b;
	}
	
	/*@GetMapping("/multi/{a}/")
	public int multiplicationError(@PathVariable int a) throws EmptyInputException {
		throw new EmptyInputException("Input Parameter is missing");
}
	@GetMapping("*")
	public String allFallbackException() throws EmptyInputException {
		throw new EmptyInputException("Input Parameter is missing");
	}

	*/
}
