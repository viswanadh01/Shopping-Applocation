package com.composite.compositems.model.cart_ms;

import java.util.List;


public class Cart {

	private int cartId;

	private List<CartLineItem> lineItems;

	public Cart() {
		super();
	}

	public Cart(int id, List<CartLineItem> cartLineItems) {
		super();
		this.cartId = id;
		this.lineItems = cartLineItems;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int id) {
		this.cartId = id;
	}

	public List<CartLineItem> getcartLineItems() {
		return lineItems;
	}

	public void setcartLineItems(List<CartLineItem> lineItems) {
		this.lineItems = lineItems;
	}

	

}
