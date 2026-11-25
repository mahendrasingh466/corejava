
package com.rays.basic.threads;

public class TestThread {

    public static void main(String[] args) {

        HelloThread t1 = new HelloThread("Ram");
        HelloThread t2 = new HelloThread("Shyam");

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
