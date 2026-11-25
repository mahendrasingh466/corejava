package com.rays.exercise;

public class CountCharacterProgram {

	public static void main(String[] args) {
		String str="Google";
	char ch = 'o';
int count = 0;

for (int i = 0; i < str.length(); i++) {
	if (str.charAt(i)==ch) {
		count++;
		
	}
}
System.out.println("o count "+ count);

	}
}
