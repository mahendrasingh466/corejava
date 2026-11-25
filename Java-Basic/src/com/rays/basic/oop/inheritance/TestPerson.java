package com.rays.basic.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
public static void main(String[] args) throws ParseException {
	BusinessMan businessMan = new BusinessMan();
	System.out.println("----------------Business Start---------------");
	businessMan.setIncome(580000);
	businessMan.setName("MahendraSingh");
	businessMan.setAddress("304 sampat hills");
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date parse = sdf.parse("02/01/2006");
	businessMan.setDob(parse);
	System.out.println("businessMan Income "+businessMan.getIncome());
	
	System.out.println(businessMan.getName());
	
	System.out.println(businessMan.getAddress());
	
	System.out.println(sdf.format(businessMan.getDob()));
	
	System.out.println("----------------Doctor Start---------------");

	Doctor doctor=new Doctor();
	doctor.setRegistrationNo("50225625");

	doctor.setName("Praveen");
	doctor.setAddress("100 vrandavan hills");
	
	SimpleDateFormat sdfDoctor = new SimpleDateFormat("dd/MM/yyyy");
	Date doctorParse = sdfDoctor.parse("02/01/2002");
	doctor.setDob(doctorParse);
	
	System.out.println(doctor.getName());
	
	System.out.println(doctor.getAddress());
	
	System.out.println(sdfDoctor.format(doctor.getDob()));
	
	System.out.println(doctor.getRegistrationNo());

	
	
	System.out.println("----------------Student Start---------------");

	
	Student student = new Student();
	student.setRollNo("A102");
	student.setMarks(400);
	
	
	student.setName("ravi");
	student.setAddress("10 hills");
	
	SimpleDateFormat sdfStudent = new SimpleDateFormat("dd/MM/yyyy");
	Date dobStudentParse = sdfStudent.parse("02/08/2000");
	student.setDob(dobStudentParse);
	
	System.out.println(student.getName());
	
	System.out.println(student.getAddress());
	
	System.out.println(sdfStudent.format(student.getDob()));
	
	
	System.out.println(student.getRollNo());
	System.out.println(student.getMarks());

}
}
