package com.datatypespractice;

public class Student {
	short rollNo=100;
	String name="Abc pqy";
	String address="Pune";
	long phNo=9767902066l;
	float percentage= 79.59f;
	char div='A';
	boolean isPass=true;
	byte std=10;
	int registrationId=1001243;
	
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("Student Details-------");
		System.out.println("Roll No.: "+s.rollNo);
		System.out.println("Name:"+s.name);
		System.out.println("Registrion Number: "+s.registrationId);
		System.out.println("Address:"+s.address);
		System.out.println("Phone No.:"+s.phNo);
		System.out.println("Std:"+s.std);
		System.out.println("Div:"+s.div);
		System.out.println("Percentage:"+s.percentage);
		System.out.println("Pass?:" +s.isPass);
	}
	

}
