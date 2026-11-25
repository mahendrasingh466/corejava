package com.rays.basic.oop.inheritance;

public class Circle extends Shape{
private int radius;
private static final double PI=3.14;


public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double areaOfCircle(int radius) {
	double areaCircle= PI *radius*radius;
	return areaCircle;
	
}
}
