package com.onlineshop.orderService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshop.orderService.entities.Order;
import com.onlineshop.orderService.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;

	@PostMapping("/order")
	public ResponseEntity<Order> saveOrderItem(@RequestBody Order order) {

		return orderService.saveOrderItem(order);
	}

	@GetMapping("/order/{id}")
	public ResponseEntity<Order> getOrderItems(@PathVariable("id") int id) {
		return orderService.getOrderItemsById(id);

	}

	@PostMapping("/order/list")
	public ResponseEntity<List<Order>> getOrderItemsList(@RequestBody List<Integer> orderIdList) {
		return orderService.getOrderItemsList(orderIdList);
	}
	
}
