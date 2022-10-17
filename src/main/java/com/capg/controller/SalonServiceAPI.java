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
import com.capg.dto.SalonServicedto;
import com.capg.exception.CustomerServiceNotFoundException;
import com.capg.service.ISalonService;

@RestController
@RequestMapping(value = "/SalonService")
public class SalonServiceAPI {

	@Autowired
	private ISalonService salonService;
	
	@Autowired
	private Environment environment;
	
	
	
}
