package com.blueyonder.customerapibff;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class OpenCsvController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/bff/customer")
	public ResponseEntity<?> modifyCustomer() throws Exception{
		Customer customer = restTemplate.getForObject("http://localhost:8080/customer",Customer.class);
			
		return new ResponseEntity(customer,HttpStatus.OK);

		}
	}
