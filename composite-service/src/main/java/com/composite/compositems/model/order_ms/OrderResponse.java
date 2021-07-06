package com.composite.compositems.model.order_ms;

import java.util.List;

public class OrderResponse {
	private int customerId;

	private List<Order> orders;

	public OrderResponse() {
		super();
	}

	public OrderResponse(int customerId, List<Order> orders) {
		super();
		this.customerId = customerId;
		this.orders = orders;
	}

	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
