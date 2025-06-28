package com.classmgmtsystem;

public class MainClass {
	public static void main(String[] args) {
		Student s=new Student();
		s.sId=101;
		s.sName="Abc";
		s.b.bId=55;
		s.b.bName="Evening";
		s.b.f.fId=14;
		s.b.f.fName="Xyz";
		s.b.f.c.cId=1001;
		s.b.f.c.cName="Java";
		
		System.out.println("Student Details 1:");
		System.out.println("Student ID: "+s.sId);
		System.out.println("Student Name: "+s.sName);
		System.out.println("Batch ID: "+s.b.bId);
		System.out.println("Batch nmae: "+s.b.bName);
		System.out.println("Faculty ID: "+s.b.f.fId);
		System.out.println("Faculty Name: "+s.b.f.fName);
		System.out.println("Course ID: "+s.b.f.c.cId);
		System.out.println("Course Name: "+s.b.f.c.cName);
		System.out.println();
		
		Student s1=new Student();
		s1.sId=102;
		s1.sName="AAA";
		s1.b.bId=54;
		s1.b.bName="Morning";
		s1.b.f.fId=14;
		s1.b.f.fName="Xyz";
		s1.b.f.c.cId=1001;
		s1.b.f.c.cName="Java";
		
		System.out.println("Student Details 2:");
		System.out.println("Student ID: "+s1.sId);
		System.out.println("Student Name: "+s1.sName);
		System.out.println("Batch ID: "+s1.b.bId);
		System.out.println("Batch Name: "+s1.b.bName);
		System.out.println("Faculty ID: "+s1.b.f.fId);
		System.out.println("Faculty Name: "+s1.b.f.fName);
		System.out.println("Course ID: "+s1.b.f.c.cId);
		System.out.println("Course Name: "+s1.b.f.c.cName);
	}

}
