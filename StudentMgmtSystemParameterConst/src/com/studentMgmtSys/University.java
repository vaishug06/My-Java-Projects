package com.studentMgmtSys;

public class University {
	public static void main(String[] args) {
		College c=new College();
		Student s=c.addStudentDetails();
//		System.out.println(s.id+" "+s.name+" "+s.address);
//		System.out.println();
		
		System.out.println(s);
		
		//System.out.println(c.s.id+" "+c.s.name+" "+c.s.address);
		
		AllStudents all=c.addAllStudentDetails();
//		System.out.println(all.stud1.id+" "+all.stud1.name+" "+all.stud1.address);
//		System.out.println();
//		System.out.println(all.stud2.id+" "+all.stud2.name+" "+all.stud2.address);
//		System.out.println();
//		System.out.println(all.stud3.id+" "+all.stud3.name+" "+all.stud3.address);
//		
		System.out.println(all.stud1);
		System.out.println(all.stud2);
		System.out.println(all.stud3);
	}

}
