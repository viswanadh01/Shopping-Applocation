package com.composite.compositems.model.customer_ms;

import javax.persistence.Id;

public class CustomerData {

	@Id
	private int customerId;

	private String customerName;
	private String email;
	private String billingAddress;
	private String shippingAddress;
	private int cartId;

	public CustomerData(int customerId, String customerName, String email, String billingAddress,
			String shippingAddress, int cartId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.cartId = cartId;
	}

	public CustomerData(int customerId, int cartId) {
		super();
		this.customerId = customerId;
		this.cartId = cartId;

	}

	public CustomerData() {
		super();
	}

	
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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
