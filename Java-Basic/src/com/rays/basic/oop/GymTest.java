package com.rays.basic.oop;

import java.text.ParseException;

public class GymTest {
public static void main(String[] args) throws ParseException {
	
	GymManagement gymManagement= new GymManagement();
	
	gymManagement.setId(1);
	gymManagement.setName("MahendraSingh");
gymManagement.setTrainerName("ravindraSingh");
gymManagement.setJoiningDate("01/01/2026");
System.out.println("gym Id is :"+ gymManagement.getId());
System.out.println("Name is :"+ gymManagement.getName());
System.out.println("trainer Name is :" + gymManagement.getTrainerName());
System.out.println("joining date is :" +gymManagement.getJoiningDate());
gymManagement.renewMembership(gymManagement.getJoiningDate());



}
}
