package com.javaeight.streams;

import java.util.Arrays;
//- filter() har number ko check karta hai.
//- n % i == 0 hone par number prime nahi hai.
//- Agar kisi number se divide nahi hota, toh prime hai.
//Prime number = sirf 1 aur khud se divisible.
public class PrimeNumberStream {

	public static void main(String[] args) {

		Integer arr[] = { 10, 7, 11, 15, 13, 20 };

		Arrays.stream(arr).filter(n -> {
			if (n < 2)
				return false;

			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					return false;
			}

			return true;
		}).forEach(System.out::println);
	}
}
