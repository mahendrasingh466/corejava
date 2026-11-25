package com.rays.basic.iostream;
//1. DataOutputStream का उपयोग primitive data को binary file में write करने के लिए होता है।
//2. DataInputStream का उपयोग binary file से primitive data read करने के लिए होता है।
//3. दोनों streams में data का order same होना चाहिए।
//4. writeInt() से लिखा data readInt() से ही read करना चाहिए।
//5. Binary file को Notepad में खोलने पर readable data नहीं दिखाई देगा।
//Interview Question: DataInputStream और BufferedReader में क्या अंतर है?
//- DataInputStream → Primitive data read करता है।
//- BufferedReader → Text या String data read करता है।

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritePrimitiveData {

    public static void main(String[] args) throws IOException {

        // Create DataOutputStream to write primitive data into a file
        DataOutputStream out = new DataOutputStream(
                new FileOutputStream("C:/binary.dat"));

        // Write integer value into file
        out.writeInt(100);

        // Write boolean value into file
        out.writeBoolean(true);

        // Write character value into file
        out.writeChar('A');

        // Write double value into file
        out.writeDouble(10.5);

        // Close output stream
        out.close();

        System.out.println("Data Written Successfully");

        // Create DataInputStream to read primitive data from file
        DataInputStream in = new DataInputStream(
                new FileInputStream("C:/binary.dat"));

        // Read integer value from file
        System.out.println(in.readInt());

        // Read boolean value from file
        System.out.println(in.readBoolean());

        // Read character value from file
        System.out.println(in.readChar());

        // Read double value from file
        System.out.println(in.readDouble());

        // Close input stream
        in.close();
    }
}