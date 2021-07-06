package com.wipro.cartservice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@Id
	@GeneratedValue
	private int cartId;

	@OneToMany(cascade =CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CartLineItem> CartlineItems;

	public Cart() {
		super();
	}

	public Cart(int id, List<CartLineItem> cartLineItems) {
		super();
		this.cartId = id;
		this.CartlineItems = cartLineItems;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<CartLineItem> getcartLineItems() {
		return CartlineItems;
	}

	public void setcartLineItems(List<CartLineItem> lineItems) {
		this.CartlineItems = lineItems;
	}

}
