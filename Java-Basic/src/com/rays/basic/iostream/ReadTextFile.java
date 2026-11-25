package com.rays.basic.iostream;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
public static void main(String[] args) throws IOException{
	
	FileReader fileReader= new FileReader("D:/test.txt");
	
	int ch = fileReader.read();
	
	while (ch!=-1) {
		System.out.println((char)ch);
	}
	fileReader.close();
}
}
