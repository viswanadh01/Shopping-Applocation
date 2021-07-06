package com.composite.compositems.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class CustomerCartEmbeddable implements Serializable {
	
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "cart_id")
	private int cartId;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	public CustomerCartEmbeddable() {
		super();
	}
	public CustomerCartEmbeddable(int customerId, int cartId) {
		super();
		this.customerId = customerId;
		this.cartId = cartId;
	}
	
	
	
	
	

}
