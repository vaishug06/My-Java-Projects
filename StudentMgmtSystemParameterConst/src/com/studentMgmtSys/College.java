package com.studentMgmtSys;

public class College {
	//Student s=new Student(101, "Abc", "Pune");
	public Student addStudentDetails() {
		Student s=new Student(101, "Abc", "Pune");
		return s;
		
	}
	public AllStudents addAllStudentDetails() {
		Student s=new Student(102, "Pqr", "PCMC");
		Student s2=new Student(103, "Ijk", "Pune");
		Student s3=new Student(104, "Xyz", "PCMC");
		AllStudents all=new AllStudents(s,s2,s3);
		return all;
	}

}
