package com.javaeight.streams.contestent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestConsestant {
public static void main(String[] args) {
	ArrayList<Contestant>list= new ArrayList<Contestant>();
	
	
	list.add(new Contestant("8526255652", "Ram"));
	list.add(new Contestant("8526255653", "Shyam"));
	list.add(new Contestant("8526255654", "Mohan"));
	list.add(new Contestant("8526255655", "Sohan"));
	list.add(new Contestant("8526255656", "Ravi"));
	list.add(new Contestant("8526255657", "Amit"));
	list.add(new Contestant("8526255658", "Sumit"));
	list.add(new Contestant("8526255659", "Rahul"));
	list.add(new Contestant("8526255660", "Vijay"));
	list.add(new Contestant("8526255661", "Ajay"));
	
	list.add(new Contestant("11", "InvalidNo"));
//getphone no	
	list.stream().map(e ->e.phone);
//remove duplicate phone no
	System.out.println("----------------Remove Duplicate Phone");
	list.stream().map(e -> e.phone).filter(e-> e.length()==10).distinct().forEach(System.out::println);
//shuffle phone no
	System.out.println("----------------Shuffle Phone No Phone");
	list.stream().map(e-> e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
		Collections.shuffle(e);return e.stream();})).forEach(System.out::println);
	
	
	System.out.println("----------------Winner 3 Phone No");

	
	list.stream().map(e-> e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
		Collections.shuffle(e);return e.stream();})).limit(3).forEach(System.out::println);
	System.out.println("--------DISPLAY-------Winners ");

	list.stream().map(e-> e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
		Collections.shuffle(e);return e.stream();})).limit(3).forEach(e-> System.out.println(e));
}
}
