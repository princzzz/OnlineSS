package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dto.Customerdto;
import com.capg.exception.CustomerServiceNotFoundException;
import com.capg.service.ICustomerService;

@RestController
@RequestMapping(value = "/infybank")
public class CustomerAPI {

	@Autowired
	private ICustomerService icustomerService;
	
	@Autowired
	private Environment environment;

	@GetMapping(value = "/customers/{userId}")
	public ResponseEntity<Customerdto> getCustomer(@PathVariable Integer userId) throws CustomerServiceNotFoundException {
		Customerdto customer = icustomerService.getCustomer(userId);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
}
