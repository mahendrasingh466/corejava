package com.rays.basic.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {

		Person p = new Person();
		p.setName("Raj");
		p.setAddress("Ranjesh");
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date parse = sdf.parse("2006/01/02");
		p.setDob(parse);
//		System.out.println(p.getDob());
		System.out.println(sdf.format(p.getDob()));
		p.age();
	}
}
