package com.rays.basic.iostream;

	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

	
	public class FileWriterText {

	    public static void main(String[] args) throws IOException {

	        FileWriter file = new FileWriter("C:/test.txt");

	        BufferedWriter out = new BufferedWriter(file);

	        out.write("Hello Java");
	        out.newLine();

	        out.write("Welcome to Rays");
	        out.newLine();

	        out.write("Java IO Stream");

	        out.close();

	        System.out.println("Data Written Successfully");
	    
	}
}
