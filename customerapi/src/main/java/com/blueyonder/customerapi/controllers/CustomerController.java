package com.blueyonder.customerapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.customerapi.model.Customer;

@RestController
public class CustomerController {

	@GetMapping("/customer")
	public ResponseEntity<Customer> customers(){
		return new ResponseEntity<Customer>(new Customer(1, "Harsha", true), HttpStatus.OK);
	}
}
