package com.composite.compositems.model.cart_ms;

import java.util.List;

public class CartRequestDto {
	
	private int cartId;
	

	private List<CartList> cartList;

	public List<CartList> getCartList() {
		return cartList;
	}

	public void setCartList(List<CartList> cartList) {
		this.cartList = cartList;
	}
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
}
