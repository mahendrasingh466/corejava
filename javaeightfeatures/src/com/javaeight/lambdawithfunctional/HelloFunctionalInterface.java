package com.javaeight.lambdawithfunctional;
@FunctionalInterface
public interface HelloFunctionalInterface {
	
public int sum(int a , int b);


public default void d1() {
	System.out.println("default called with object create");
}
public static void m1() {
	System.out.println("static method called with class Name");
	
}
}
