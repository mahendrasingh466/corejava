package com.rays.exercise;

import java.util.Scanner;

public class OperatorExample {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

     String operator = sc.next();
int a = sc.nextInt();
int b= sc.nextInt();

     switch (operator) {

     case "+":
         System.out.println(a + b);
         break;

     case "-":
         System.out.println(a - b);
         break;

     case "*":
         System.out.println(a * b);
         break;

     case "/":
         System.out.println(a / b);
         break;

        
     }

 
}
}
