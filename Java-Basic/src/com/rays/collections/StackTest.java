package com.rays.collections;

import java.util.Stack;

public class StackTest {
public static void main(String[] args) {
	Stack<String> st= new Stack<>();

st.push("a");
st.push("b");
st.push("c");

System.out.println(st);

System.out.println(st.peek());
System.out.println(st.pop());


}
}
