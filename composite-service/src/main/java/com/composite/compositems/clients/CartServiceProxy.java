package com.composite.compositems.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.composite.compositems.model.cart_ms.Cart;

@FeignClient(name = "CART-SERVICE")
public interface CartServiceProxy {
	
	@PostMapping("/cart")
	public ResponseEntity<Cart> saveCartItem(@RequestBody Cart cart);

	@GetMapping("/cart/{id}")
	public ResponseEntity<Cart> getCartItems(@PathVariable("id") int id);
	
	@PutMapping("/cart/{cartId}")
	public ResponseEntity<Cart> updateCartItem(@RequestBody Cart cart, @PathVariable("cartId") int id);
	
	@DeleteMapping("/cart/{id}/cartItems")
	public ResponseEntity<Cart> deleteCartItems(@PathVariable("id") int id);
}
