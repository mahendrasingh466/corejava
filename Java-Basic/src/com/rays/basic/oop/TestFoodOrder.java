package com.rays.basic.oop;

public class TestFoodOrder {
public static void main(String[] args) {
	FoodOrder foodOrder= new FoodOrder();
	foodOrder.setId(1);
	foodOrder.setCustomerName("ajay");
	foodOrder.setOrderAmount(5000);
	foodOrder.setDeliveryStatus("Order pending");
	foodOrder.setRestaurentName("GK");	
	 
	System.out.println(foodOrder.getId());

System.out.println(foodOrder.getDeliveryStatus());
foodOrder.trackOrder("order is ON the Way");
System.out.println(foodOrder.getCustomerName());
System.out.println(foodOrder.getRestaurentName());
System.out.println(foodOrder.getDeliveryStatus());



FoodOrder foodOrder2= new FoodOrder();
foodOrder2.setId(2);
foodOrder2.setCustomerName("mahendra");
foodOrder2.setOrderAmount(1500);
foodOrder2.setRestaurentName("UBUD");
foodOrder2.setDeliveryStatus("Order pending");


System.out.println(foodOrder2.getId());

System.out.println(foodOrder2.getDeliveryStatus());
System.out.println(foodOrder2.getCustomerName());
System.out.println(foodOrder2.getRestaurentName());
foodOrder2.placeOrder("order Placed");
System.out.println(foodOrder2.getDeliveryStatus());

}
}
