package com.rays.exercise;

public class PallindromNumber {
public static void main(String[] args) {
	int number = 1551;
	
	int rem=0;
	int sum=0;
	int n=number;
	
	while(n>0) {
	rem= n%10;
	sum=(sum *10 )+rem;
	
	n=n/10;
	
		
	}
	
	if (sum==number) {
		System.out.println("pallindrom "+sum);
	}else {
		System.out.println("not pallindrom ");

	}
}
}
