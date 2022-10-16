
package com.capg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entity.Customer;


@Repository 
public interface ICustomerRepository extends JpaRepository <Customer, String>{

  List<Customer> findByUserId(String userId);
	
}

