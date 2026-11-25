package com.javaeight.streams;

import java.util.Arrays;

public class OddEvenStream {
public static void main(String[] args) {
	Integer arr[]= {10,25,88,25,52,55};

    //even
	Arrays.stream(arr).filter(n->n%2==0).sorted().distinct().forEach(System.out::println);
 
    
    //odd 
    
    
    
    Arrays.stream(arr)
    .filter(n -> n % 2 != 0)
    .forEach(System.out::println);
	
	
	
	
}
}
