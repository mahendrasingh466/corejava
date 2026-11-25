package com.rays.basic.oop;

public class FoodOrder {
	private int id;
	private String customerName;
	private String restaurentName;
	private double orderAmount;
	private String deliveryStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getRestaurentName() {
		return restaurentName;
	}

	public void setRestaurentName(String restaurentName) {
		this.restaurentName = restaurentName;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public void placeOrder(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public void trackOrder(String deliveryStatus) {

		this.deliveryStatus = deliveryStatus;
	}

}
