package com.rays.basic.constructors;

public class Shape {

	protected int boderWidth;
	protected String color;

	public Shape() {
		System.out.println("default constructor");

	}

	public Shape(int boderWidth) {
		this();
		this.boderWidth = boderWidth;
		System.out.println(boderWidth);
	}

	public Shape(String color) {
		this(25);
		this.color = color;
		System.out.println(color);
	}

}
