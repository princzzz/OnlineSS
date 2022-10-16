package com.capg.service;


import java.util.List;

import com.capg.dto.Customerdto;
import com.capg.entity.Customer;
import com.capg.exception.CustomerServiceNotFoundException;

public interface ICustomerService {

	public Customerdto getCustomer(String userId) throws CustomerServiceNotFoundException;
	public Integer addCustomer(Customerdto customer) throws CustomerServiceNotFoundException;
	public void updateCustomer(String userId, Customer customer) throws CustomerServiceNotFoundException;
	public void deleteCustomer(String userId) throws CustomerServiceNotFoundException;
	public List<Customerdto> getAllCustomers() throws CustomerServiceNotFoundException;
}
