package com.wipro.cartservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.wipro.cartservice.entity.CartLineItem;

@Repository
public interface LineItemRepository extends JpaRepository<CartLineItem, Integer> {

}
