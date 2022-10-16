package com.capg.service;
import java.util.List;
import com.capg.dto.Ordersdto;
import com.capg.entity.Orders;
import com.capg.exception.OrderServiceNotFoundException;


public interface IOrderService {
	
	public Orders addOrder(Ordersdto order) throws OrderServiceNotFoundException;
	public Orders deleteOrder(Long orderId) throws OrderServiceNotFoundException;
	public void updateOrder(Long orderId, Orders orders) throws OrderServiceNotFoundException;
	public Orders getOrderDetails(Long orderId) throws OrderServiceNotFoundException;
	public List<Orders> getAllOrders() throws OrderServiceNotFoundException ;
}