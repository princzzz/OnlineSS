package com.capg.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.dto.Addressdto;
import com.capg.dto.Customerdto;
import com.capg.entity.Address;
import com.capg.entity.Customer;
import com.capg.exception.CustomerServiceNotFoundException;
import com.capg.repository.ICustomerRepository;




@Service(value = "customerService")
@Transactional
public class CustomerServiceImp implements ICustomerService{
	
	@Autowired
	private ICustomerRepository customerRepository;
	
	
	@Override
	public Integer addCustomer(Customerdto customer) throws CustomerServiceNotFoundException {
		Customer customerEntity = new Customer();
		customerEntity.setUserId(customer.getUserId());
		customerEntity.setName(customer.getName());
		customerEntity.setEmail(customer.getEmail());
		customerEntity.setContactNo(customer.getContactNo());
		customerEntity.setDob(customerEntity.getDob());
		
		//Address address= new Address();
		
		
		
		/*
		
		Address address = new Address();
		address.setAddressId(customerDTO.getAddress().getAddressId());
		address.setCity(customerDTO.getAddress().getCity());
		address.setStreet(customerDTO.getAddress().getStreet());
		
		customer.setAddress(address);
		
		*/
		//Set<Address> addressdto= (Set<Address>) Addressdto.getAddress(); 
		
		
		
		/*List<CardDTO> cardDTOs = customerDTO.getCards();
		List<Card> cards; 
		
		cards = cardDTOs.stream()
				.map(c->new Card(c.getCardId(),c.getCardNumber(),c.getExpiryDate()))
				.collect(Collectors.toList());
		customer.setCards(cards);*/
		//customerEntity.setDateOfBirth(customer.getDateOfBirth());
		//customerEntity.setEmailId(customer.getEmailId());
		//customerEntity.setName(customer.getName());
		//customerEntity.setCustomerId(customer.getCustomerId());
		Customer customerEntity2 = customerRepository.save(customerEntity);
		return customerEntity2.getUserId();
	}

}
