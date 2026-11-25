package com.rays.basic.stringsprogram;

public class StringMethods {
public static void main(String[] args) {

			String name = "Vijay Dinanath Chauhan";

			// 1. length()
			System.out.println(name.length() + " length of String");

			// 2. charAt()
			System.out.println(name.charAt(6) + " print Vijay _ D");

			// 3. indexOf()
			System.out.println(name.indexOf("Dina") + " index of Dina");

			// 4. indexOf()
			System.out.println(name.indexOf('i') + " first i position");

			// 5. lastIndexOf()
			System.out.println(name.lastIndexOf('i') + " last i position");

			// 6. replace()
			System.out.println(name.replace('a', 'b') + " a is replaced by b");

			// 7. toLowerCase()
			System.out.println(name.toLowerCase() + " lowercase");

			// 8. toUpperCase()
			System.out.println(name.toUpperCase() + " uppercase");

			// 9. startsWith()
			System.out.println(name.startsWith("Vijay") + " starts with Vijay");

			// 10. endsWith()
			System.out.println(name.endsWith("han") + " ends with han");

			// 11. substring()
			System.out.println(name.substring(6) + " substring from index 6");
			// 11. trim()
			System.out.println(name.trim() + "remove space");
			
			
			String str = "Java,Spring Boot,Microservices,Kafka";

			String[] arr = str.split(",");

			for (String s : arr) {
			    System.out.println(s);
			}
			
		}
		
	}
