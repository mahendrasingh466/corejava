package com.rays.exercise;

public class ArmStrongExample {
public static void main(String[] args) {
	int number= 153;
	int rem=0;
	int sum=0;
	int n= number;
	
	while (n>0) {
		rem= n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
	}
	if (sum==number) {
		System.out.println("Arm Strong");
	}else {
		System.out.println("Not Arm Strong");

	}
}
}
