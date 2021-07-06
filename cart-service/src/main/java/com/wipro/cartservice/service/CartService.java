package com.wipro.cartservice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.cartservice.entity.Cart;
import com.wipro.cartservice.repository.LineItemRepository;
import com.wipro.cartservice.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartrepo;
	
	@Autowired LineItemRepository lineitemrepo;

	public List<Cart> getCartItems() {
		return cartrepo.findAll();
	}

	public Cart getCartItemById(int id) {
		return cartrepo.findById(id).orElse(null);
	}

	public Cart saveOrUpdate(Cart cart) {
		return cartrepo.save(cart);
	}

	public void deleteCartItems(int id) {
		cartrepo.deleteById(id);
	}
	
	public void deleteCartLineItemById(int id) {
		lineitemrepo.deleteById(id);
	}

}
