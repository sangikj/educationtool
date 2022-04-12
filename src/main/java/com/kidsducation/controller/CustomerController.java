package com.kidsducation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kidsducation.repository.Customer;
import com.kidsducation.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	
	@Autowired
	CustomerRepository customerRepository;
	
	 @PostMapping("/")
	  	public ResponseEntity<Customer> newEmployee(@RequestBody Customer customer) {
			    customerRepository.save(customer);
			    return new ResponseEntity<>(customer, HttpStatus.OK);
			    
	  }
	 
	 
	 @GetMapping("/all")
	  public ResponseEntity<List<Customer>> getAllTutorials() {
	   
	      List<Customer> customers = new ArrayList<Customer>();
	      customers=customerRepository.findAll();
	      if (customers.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(customers, HttpStatus.OK);
	      
	  }
}
