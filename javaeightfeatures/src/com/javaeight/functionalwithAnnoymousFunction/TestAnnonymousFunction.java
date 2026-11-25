package com.javaeight.functionalwithAnnoymousFunction;

public class TestAnnonymousFunction {
public static void main(String[] args) {
	HelloInterface H1= new HelloInterface() {
		@Override
		public void m1() {
System.out.println("this is m1 called");			
		}
		@Override
		public void m2() {
System.out.println("this is m2 called");			
		}
	};
	H1.m1();
	H1.m2();
}
}
