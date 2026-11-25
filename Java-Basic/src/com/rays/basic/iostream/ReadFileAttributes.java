package com.rays.basic.iostream;
import java.io.File;
import java.util.Date;



//Binary Stream	Character Stream
//InputStream	Reader
//OutputStream	Writer
//Bytes handle karta hai	Characters handle karta hai
//Images, PDFs etc.	Text files
//
//Java IO mein 2 main categories hain:
//1. Byte Stream – InputStream / OutputStream
//2. Character Stream – Reader / Writer



public class ReadFileAttributes {

    public static void main(String[] args) {

        File f = new File("C:/temp/a.txt");

        if (f.exists()) {

            System.out.println("Name: " + f.getName());

            System.out.println("Absolute path: " + f.getAbsolutePath());

            System.out.println("Is writable: " + f.canWrite());

            System.out.println("Is readable: " + f.canRead());

            System.out.println("Is File: " + f.isFile());

            System.out.println("Is Directory: " + f.isDirectory());

            System.out.println("Last Modified at: " + new Date(f.lastModified()));

            System.out.println("Size: " + f.length() + " bytes long.");

        } else {
            System.out.println("File does not exist.");
        }
    }
}
