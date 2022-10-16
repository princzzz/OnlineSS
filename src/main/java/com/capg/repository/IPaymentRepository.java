package com.capg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entity.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Long >{
	
	List<Payment> findByPaymentId(long paymentId);
	

}
