package com.onlineshop.orderService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.onlineshop.orderService.entities.Order;
import com.onlineshop.orderService.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepo;

	@Override
	public ResponseEntity<Order> saveOrderItem(Order order) {
		try {
			Order ordr = orderRepo.save(order);
			return new ResponseEntity<>(ordr, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Override
	public ResponseEntity<Order> getOrderItemsById(int id) {
		try {
			Order order = orderRepo.findById(id).get();
			return new ResponseEntity<>(order, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<List<Order>> getOrderItemsList(List<Integer> orderIdList) {
		try {
			List<Order> ordr = orderRepo.findAllById(orderIdList);
			return new ResponseEntity<>(ordr, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
