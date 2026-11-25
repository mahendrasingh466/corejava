package com.javaeight.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArrayUsingArrays {
public static void main(String[] args) {
    Integer[] arr1 = {101, 10, 11, 17};
    Integer[] arr2 = {11, 20, 5, 101};
    
//    Arrays.stream(arr1)	First array ka Stream banata hai
//    Arrays.stream(arr2)	Second array ka Stream banata hai
//    Stream.concat()	Dono Streams ko merge karta hai
//    distinct()	Duplicate remove karta hai
//    sorted()	Ascending order mein sort karta hai
//    forEach()	Elements print karta hai
    
    Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().forEach(System.out::println);
    
    
    
    
}
}
