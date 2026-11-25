package com.rays.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
public static void main(String[] args) {
    List<Employee> list = new ArrayList<>();

    list.add(new Employee(3, "103","Rahul",5003));
    list.add(new Employee(2, "102","Rahul",5002));
    list.add(new Employee(1, "101","Rahul",5001));
  
    
    
//	actual sort done
    Collections.sort(list);

    for (Employee e : list) {
        System.out.println(e.getId());
        System.out.println(e.getRollNo());
        System.out.println(e.getName());
        System.out.println(e.getSalary());

    }
}

	

}
