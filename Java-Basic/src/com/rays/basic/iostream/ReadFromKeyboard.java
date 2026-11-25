package com.rays.basic.iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
	public static void main(String[] args) throws IOException {
		PrintWriter out=new PrintWriter(new File(("E://temp.txt")));
		
		
		//byte to char convert useing inputstreamreader
		
		
		InputStreamReader kb= new InputStreamReader(System.in);
		BufferedReader in= new BufferedReader(kb);
		
		String line=in.readLine();
		while (!line.equals("quit")) {
			out.println(line);
			line=in.readLine();
		}
		
		
		in.close();
		out.close();
		kb.close();
	}
	

}
