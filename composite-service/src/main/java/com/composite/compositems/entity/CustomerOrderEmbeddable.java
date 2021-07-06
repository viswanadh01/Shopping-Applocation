package com.composite.compositems.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class CustomerOrderEmbeddable implements Serializable {

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "order_id")
	private int orderId;

	public CustomerOrderEmbeddable() {
		super();
	}

	public CustomerOrderEmbeddable(int customerId, int orderId) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

}
