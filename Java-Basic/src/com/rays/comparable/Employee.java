package com.rays.comparable;

public class Employee implements Comparable<Employee> {

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

//@Override
//public String toString() {
//	return "Employee id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + "";
//}

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
//	Sorting rule define  return 1 0 -1 value  
	@Override
	public int compareTo(Employee e) {
		return id - e.id;

	}

}
