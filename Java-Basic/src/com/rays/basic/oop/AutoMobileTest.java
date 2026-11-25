package com.rays.basic.oop;
public class AutoMobileTest {
	public static void main(String[] args) {
		AutoMobile autoMobile = new AutoMobile();
		autoMobile.setMake("car");
		autoMobile.setColor("Black");
		autoMobile.accelerator(50);
		System.out.println("Make: " + autoMobile.getMake());
		System.out.println("Color: " + autoMobile.getColor());
		System.out.println("Speed: " + autoMobile.getSpeed());

		//Change Gear
		autoMobile.changeGear(5);

		//Increase speed
		autoMobile.accelerator(20);
		System.out.println("After accelerator:");
		System.out.println("Speed: " + autoMobile.getSpeed());

		// Brake
		autoMobile.brake();
		System.out.println("After brake:");
		System.out.println("Speed: " + autoMobile.getSpeed());
	}

}
