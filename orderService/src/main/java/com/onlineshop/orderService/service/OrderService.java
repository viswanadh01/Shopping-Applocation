package com.onlineshop.orderService.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.onlineshop.orderService.entities.Order;

@Service
public interface OrderService {
	

	public ResponseEntity<Order> saveOrderItem(Order order);

	public ResponseEntity<Order> getOrderItemsById(int id);

	public ResponseEntity<List<Order>> getOrderItemsList(List<Integer> orderIdList);
	

}
