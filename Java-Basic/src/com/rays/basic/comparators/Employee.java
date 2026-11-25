package com.rays.basic.comparators;


public class Employee {

	private int id;

	private String rollNo;

	private String name;
	private double salary;

	public Employee(int id, String rollNo, String name, double salary) {
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}



}
