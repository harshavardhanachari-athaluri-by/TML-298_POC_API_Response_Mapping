package com.blueyonder.opencsv.controllers;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.blueyonder.opencsv.dto.Customer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.opencsv.CSVReader;

@RestController
public class OpenCsvController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/bff/customer")
	public ResponseEntity<?> modifyCustomer() throws Exception{
		Customer customer = restTemplate.getForObject("http://localhost:8080/customer",Customer.class);
		
		var fileName = "src/main/resources/keys.csv";
		 String[] nextLine = null;
		 List keyslist = new ArrayList<>();
		try (var fr = new FileReader(fileName, StandardCharsets.UTF_8);
	             var reader = new CSVReader(fr)) {
			while ((nextLine = reader.readNext()) != null) {
                for (var e : nextLine) {
                    keyslist.add(e);
                }
            }
			
		return new ResponseEntity(customer,HttpStatus.OK);

		}
		}
	}
