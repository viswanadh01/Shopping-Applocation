package com.onlineshop.orderService.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private int orderId;

	@OneToMany(targetEntity = OrderLineItem.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "co_fk", referencedColumnName = "order_id")
	private List<OrderLineItem> orderLineItems;

	@Column(name = "order_date")
	private LocalDate orderDate;

	@Column(name = "grand_total")
	private double totalPrice;

	@Column(name = "delivery_address")
	private String deliveryAddress;

	public Order() {

	}

	public Order(LocalDate orderDate, double totalPrice, String deliveryAddress, List<OrderLineItem> orderLineItems) {
		//super();
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.deliveryAddress = deliveryAddress;
		this.orderLineItems = orderLineItems;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<OrderLineItem> getOrderLineItems() {
		return orderLineItems;
	}

	public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
		this.orderLineItems = orderLineItems;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderLineItems=" + orderLineItems + ", orderDate=" + orderDate
				+ ", totalPrice=" + totalPrice + "]";
	}

}