package com.capg.service;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.dto.Customerdto;
import com.capg.entity.Customer;
import com.capg.exception.CustomerServiceNotFoundException;

public interface ICustomerService extends JpaRepository<Customer, String>{

	public Customerdto getCustomer(String userId) throws CustomerServiceNotFoundException;
	public Customer addCustomer(Customerdto customer) throws CustomerServiceNotFoundException;
	public Customer updateCustomer(String userId, Customer customer) throws CustomerServiceNotFoundException;
	public Customer deleteCustomer(String userId) throws CustomerServiceNotFoundException;
	public List<Customerdto> getAllCustomers() throws CustomerServiceNotFoundException;
}
