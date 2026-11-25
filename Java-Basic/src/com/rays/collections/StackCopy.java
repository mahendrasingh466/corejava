package com.rays.collections;

import java.util.Stack;

public class StackCopy {
	
	
	public static void main(String[] args) {
		
	
	Stack<String> st= new Stack<>();

	st.push("a");
	st.push("b");
	st.push("c");
	st.push("d");
	st.push("e");
	st.push("f");
	st.push("g");
	st.push("h");
	st.push("i");
	st.push("j");
	st.push("k");
	st.push("l");
	st.push("m");
	st.push("n");
	st.push("o");
	st.push("p");
	st.push("q");
	st.push("r");
	st.push("s");
	st.push("t");
	st.push("u");
	st.push("v");
	st.push("w");
	st.push("x");
	st.push("y");
	st.push("z");
	

	System.out.println(st);
	
	Stack s2 = new Stack();
	s2.push(st);
	System.out.println("s2-----------------------------------------------------------");

	System.out.println(s2);
	
	


}
}