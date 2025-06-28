package com.studentmgmtsystem;

public class College {
	public Student addStudentDetails() {
		Student s=new Student();
		s.id=101;
		s.name="Efg";
		s.address="Pune";
		return s;
	}
	
	public AllStudentDetails addAllStudDetails() {
		AllStudentDetails all=new AllStudentDetails();
		all.s1.id=102;
		all.s1.name="Abc";
		all.s1.address="Pune";
		
		all.s2.id=103;
		all.s2.name="Pqr";
		all.s2.address="PCMC";
		
		all.s3.id=104;
		all.s3.name="Xyz";
		all.s3.address="Pune";
		
		return all;
	}

}
