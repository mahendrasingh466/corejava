package com.javaeight.streams;

import java.util.Arrays;
import java.util.Collections;

public class SecondHighestArray {
public static void main(String[] args) {
	Integer arr[] = {10, 25, 88, 55, 55, 52};

	Arrays.stream(arr)
	      .distinct()
	      .sorted(Collections.reverseOrder())
	      .skip(1)
	      .limit(1)
	      .forEach(System.out::println);
}
}
