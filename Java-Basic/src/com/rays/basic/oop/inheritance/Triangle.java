package com.rays.basic.oop.inheritance;

public class Triangle extends Shape{
private int hight;
private int base;
public int getHight() {
	return hight;
}
public void setHight(int hight) {
	this.hight = hight;
}
public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public double areaOfTriangle(int base, int hight) {
	double area = 0.5 * base * hight;
	return area;
	
}



}
