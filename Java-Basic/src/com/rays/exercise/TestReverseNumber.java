package com.rays.exercise;

public class TestReverseNumber {

	public static void main(String[] args) {

		int number = 153;

		int rem = 0;

		int sum = 0;

		int n = number;

		while (n > 0) {

			rem = n % 10; 

			sum = (sum * 10) + rem;

			n = n / 10; // n = 0

		}

		System.out.println(number + " reverse number = " + sum);

	}

}
