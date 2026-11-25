package com.rays.exercise;

public class ArmstrongNumber {
public static void main(String[] args) {

	int number = 153;

	int rem = 0;

	int sum = 0;

	int n = number;

	while (n > 0) { // n = 0

		rem = n % 10; // rem = 1 

		sum = sum + (rem * rem * rem); // sum = 153

		n = n / 10; // n = 0

	}

	if (number == sum) {
		System.out.println("arm strong number");
	} else {
		System.out.println("not arm strong number");
	}



}
}
