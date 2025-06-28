package com.studentmgmtsystemwitharray;

public class University {
	public static void main(String[] args) {
		College c=new College();
		System.out.println("Enter student details:");
		Student[] stud=c.addStudent();
		System.out.println("ID\tName\tAddress");
		for(Student s: stud ) {
			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSaddress());
		}
	}

}
