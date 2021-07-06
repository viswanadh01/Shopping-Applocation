package com.onlineshop.orderService.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class OrderLineItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderLineId;
	int productId;
	String productName;
	double price;
	int quantity;
	double totalprice;

	public OrderLineItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderLineItem(int productid, String name, double price, int quantity, double totalprice) {
		super();
		this.productId = productid;
		this.productName = name;
		this.price = price;
		this.quantity = quantity;
		this.totalprice = totalprice;
	}

	public int getOrderLineId() {
		return orderLineId;
	}

	public void setItemId(int itemId) {
		this.orderLineId = itemId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productid) {
		this.productId = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	@Override
	public String toString() {
		return "LineItem [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity
				+ ", totalprice=" + totalprice + "]";
	}

}
