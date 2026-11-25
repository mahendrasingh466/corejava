package com.javaeight.lambdawithfunctional;

public class TestHelloFunctionLambda {
public static void main(String[] args) {
	HelloFunctionalInterface h=(a,b) ->{
		
		return a+b;
		
	};
	System.out.println(h.sum(12,11));
	
}
}
