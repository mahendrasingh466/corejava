package com.rays.exercise;

public class ReverseNumber {
//	n = 151
//			  ↓
//			1st loop
//			151 % 10 = 1
//			sum = 1
//			151 / 10 = 15
//			  ↓
//			2nd loop
//			15 % 10 = 5
//			sum = 15
//			15 / 10 = 1
//			  ↓
//			3rd loop
//			1 % 10 = 1
//			sum = 151
//			1 / 10 = 0
    public static void main(String[] args) {

        int number = 151;
        // Original number = 151

        int rem = 0;
        // rem = last digit temporarily store karega

        int sum = 0;
        // sum = reverse number banayega

        int n = number;
        // n = 151
        // Calculation ke liye n use karenge
        // number ko directly change nahi karenge


        while (n > 0) {
            // Jab tak n > 0 hai, loop chalega


            rem = n % 10;
            // % 10 se LAST DIGIT milega
            //
            // First time:
            // 151 % 10 = 1
            //
            // rem = 1


            sum = (sum * 10) + rem;
            // Reverse number banana start kar rahe hain
            //
            // First time:
            // sum = (0 * 10) + 1
            // sum = 1


            n = n / 10;
            // / 10 se LAST DIGIT remove hota hai
            //
            // First time:
            // 151 / 10 = 15
            //
            // n = 15
        }


        System.out.println("reverse number = " + sum);
        // Reverse number print hoga
    }
}