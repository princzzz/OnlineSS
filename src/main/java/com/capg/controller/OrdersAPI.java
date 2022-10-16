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
import com.capg.dto.Ordersdto;
import com.capg.entity.Orders;
import com.capg.exception.CustomerServiceNotFoundException;
import com.capg.exception.OrderServiceNotFoundException;
import com.capg.service.ICustomerService;
import com.capg.service.IOrderService;

@RestController
@RequestMapping(value = "/abc")
public class OrdersAPI {


	@Autowired
	private IOrderService iOrderService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "/customers/{orderId}")
	public ResponseEntity<Orders> getOrderDetails(@PathVariable Long orderId) throws OrderServiceNotFoundException {
		Orders orders=iOrderService.getOrderDetails(orderId);
		return new ResponseEntity<>(orders, HttpStatus.OK);
		//return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
}
