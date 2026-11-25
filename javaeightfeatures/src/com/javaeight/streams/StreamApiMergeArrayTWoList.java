package com.javaeight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiMergeArrayTWoList {

	    public static void main(String[] args) {

	        List<Integer> list1 = new ArrayList<>();
	        list1.add(101);
	        list1.add(10);
	        list1.add(11);
	        list1.add(17);

	        List<Integer> list2 = new ArrayList<>();
	        list2.add(11);
	        list2.add(20);
	        list2.add(5);
	        list2.add(101);
//	        list1.stream(arr1)	First list ka Stream banata hai
//	        list1.stream(arr2)	Second list ka Stream banata hai
//	        Stream.concat()	Dono Streams ko merge karta hai
//	        distinct()	Duplicate remove karta hai
//	        sorted()	Ascending order mein sort karta hai
//	        forEach()	Elements print karta hai
	        
	        Stream.concat(list1.stream(), list2.stream())
	              .distinct()
	              .sorted()
	              .forEach(System.out::println);
	    }
	

	
}
