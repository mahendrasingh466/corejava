package com.rays.basic.oop;

public class AccountTest {

    public static void main(String[] args) {

        Account a = new Account();
        a.setNumber("ACC101");
        a.setAccountType("Saving");
        a.deposit(10000);
        System.out.println("----- Account A -----");
        System.out.println("Account Number: "+a.getNumber());
        System.out.println("Account Type: "+a.getAccountType());
        System.out.println("Balance: " + a.getBalance());
        a.withdraw(5000);  // 10-5 = 5
        System.out.println("After Withdraw:");
        System.out.println("Balance: " + a.getBalance());

        // Pay Bill
        a.payBill(1000);     // 5-1 = 4

        System.out.println("After Account A Pay Bill 1000");
        System.out.println("Account A Balance: " + a.getBalance());

        Account b = new Account();
        b.setNumber("ACC102");
        b.setAccountType("Current");
        b.deposit(5000);          // b 5

        System.out.println("----- Account B -----");
        System.out.println("Account Number: " + b.getNumber());
        System.out.println("Account Type: " + b.getAccountType());
        System.out.println("Balance: " + b.getBalance());


        // Fund Transfer a to b
        a.fundTransfer(b, 3000);

        System.out.println("After Fund Transfer 3000");

        System.out.println("Account A Balance: " + a.getBalance());  //4 old tha -3  , 1000
        System.out.println("Account B Balance: " + b.getBalance());  //5+3 = 8 

    }
}