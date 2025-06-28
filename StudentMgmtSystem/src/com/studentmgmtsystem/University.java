package com.studentmgmtsystem;

public class University {
	
	public static void main(String[] args) {
		College c=new College();
		Student s1=c.addStudentDetails();
		System.out.println(s1.id+" "+s1.name+" "+s1.address);
		System.out.println();
		
		AllStudentDetails all1=c.addAllStudDetails();
		System.out.println(all1.s1.id+" "+all1.s1.name+" "+all1.s1.address);
		System.out.println();
		System.out.println(all1.s2.id+" "+all1.s2.name+" "+all1.s2.address);
		System.out.println();
		System.out.println(all1.s3.id+" "+all1.s3.name+" "+all1.s3.address);
	}

}
