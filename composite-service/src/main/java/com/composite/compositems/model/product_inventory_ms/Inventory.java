package com.composite.compositems.model.product_inventory_ms;

public class Inventory {

	private int product_id;
	private int quantity;
	
	
	public Inventory(int product_id, int quantity) {
		super();
		this.product_id = product_id;
		this.quantity = quantity;
	}
	
	public Inventory() {
		
	}
	
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	public String toString() {
		return "Inventory [product_id=" + product_id + ", quantity=" + quantity + "]";
	}
	
	
}
