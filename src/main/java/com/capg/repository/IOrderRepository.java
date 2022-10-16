package com.capg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.capg.entity.Orders;

@Repository
public interface IOrderRepository extends JpaRepository<Orders, Long>{
	
	List<Orders> getAllOrders(long orderId);

}
