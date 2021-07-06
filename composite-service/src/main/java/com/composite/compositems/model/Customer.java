package com.composite.compositems.model;

public class Customer {

	private int customerId;
	private String customerName;
	private String email;
	private String billingAddress;
	private String shippingAddress;

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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Customer(int customerId, String customerName, String email, String billingAddress, String shippingAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {

		return "Customer [ customerId=" + customerId + ",customerName=" + customerName + "]";
	}

}
