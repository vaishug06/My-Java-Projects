package com.tostring;

public class Student {
	int rollno;
	String name;
	{
		System.out.println("Non-static block");
	}
	Student()
	{
		System.out.println("Default constructor");
	}
	public String toString() {
		String s="Student Details Roll No.: "+rollno+ " Name: "+name;
		return s;
	}
	
	

}
