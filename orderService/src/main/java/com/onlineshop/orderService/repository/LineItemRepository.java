package com.onlineshop.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineshop.orderService.entities.OrderLineItem;


@Repository
public interface LineItemRepository extends JpaRepository<OrderLineItem, Integer> {

}
