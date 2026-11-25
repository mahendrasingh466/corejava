package com.javaeight.streams;

import java.util.Arrays;
//Condition	           Return value
//a is smaller than b	Negative
//a equals b	          0
//a is greater than b	Positive
public class FindMaxNumberArray {
	public static void main(String[] args) {
		
	
	Integer arr[]= {10,25,88,25,52,55};
//	Comparable methodcompareTo () in Integer class 
	Arrays.stream(arr).max((a, b) -> a.compareTo(b)).ifPresent(System.out::println);
	}
}