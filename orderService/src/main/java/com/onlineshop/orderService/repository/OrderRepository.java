package com.onlineshop.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshop.orderService.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
