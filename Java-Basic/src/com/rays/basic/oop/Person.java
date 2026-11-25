package com.rays.basic.oop;

import java.util.Date;

public class Person {

    private String name;
    private String address;
    private static final int AGE = 18;

    private Date dob;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int age() {

        Date date = new Date();

        int age = date.getYear() - dob.getYear();

        if (age >= AGE) {
            System.out.println("Eligible for vote: " + age);
        } else {
            System.out.println("Not eligible for vote: " + age);
        }

        return age;
    }
}