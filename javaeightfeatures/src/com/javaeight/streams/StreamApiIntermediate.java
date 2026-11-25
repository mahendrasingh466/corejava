package com.javaeight.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamApiIntermediate {

	public static void main(String[] args) {
		
		
	List<Integer>list= new ArrayList<Integer>();	
		
	list.add(101);
	list.add(10);
	list.add(11);
	list.add(17);
	list.add(11);
	
	
	System.out.println(list);
	//remove duplicate and sorted ascending 
	list.stream().sorted().distinct().forEach(System.out:: println);
	
	
		
	}
}
