package com.composite.compositems.model.product_inventory_ms;

public class ProductData {

	private int product_id;
	private String product_name;
	private double price;
	private int quantity;
	
	public ProductData() {

	}
	
	public ProductData(int product_id, String product_name, double price, int quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.quantity = quantity;
	}


	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

}
