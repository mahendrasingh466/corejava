package com.rays.exercise;

public class TestPalindromeNumber {

	public static void main(String[] args) {

		int number = 151;

		int rem = 0;

		int sum = 0;

		int n = number;

		while (n > 0) {

			rem = n % 10;

			sum = (sum * 10) + rem;

			n = n / 10; // n = 0

		}

		if (number == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome number");
		}

	}

}
