package com.classmgmtsys;

public class MainClass {
	public static void main(String[] args) {
		Course course1=new Course();
		course1.setCid(101);
		course1.setCname("Java");
		
		Faculty faculty1=new Faculty();
		faculty1.setFid(201);
		faculty1.setFname("Neha");
		faculty1.setCourse(course1);
		
		Batch batch1=new Batch();
		batch1.setBid(301);
		batch1.setBname("Morning");
		batch1.setFaculty(faculty1);
		
		Student stud1=new Student();
		stud1.setSid(401);
		stud1.setSname("Abc");
		stud1.setBatch(batch1);
		Student stud2=new Student();
		stud2.setSid(402);
		stud2.setSname("PQR");
		stud2.setBatch(batch1);
		
		Batch batch2=new Batch();
		batch2.setBid(302);
		batch2.setBname("Evening");
		batch2.setFaculty(faculty1);
		
		Student stud3=new Student();
		stud3.setSid(403);
		stud3.setSname("XYZ");
		stud3.setBatch(batch2);
		
		Student stud4=new Student();
		stud4.setSid(404);
		stud4.setSname("LMO");
		stud4.setBatch(batch2);
		
		System.out.println("StudID\tName\tBatchID\tBName\tFID\tFName\tCID\tCName");
		System.out.println(stud1.getSid()+"\t"+stud1.getSname()+"\t"+stud1.getBatch().getBid()+"\t"+stud1.getBatch().getBname()+"\t"+stud1.getBatch().getFaculty().getFid()+"\t"+stud1.getBatch().getFaculty().getFname()+"\t"+stud1.getBatch().getFaculty().getCourse().getCid()+"\t"+stud1.getBatch().getFaculty().getCourse().getCname());
		System.out.println(stud2.getSid()+"\t"+stud2.getSname()+"\t"+stud2.getBatch().getBid()+"\t"+stud2.getBatch().getBname()+"\t"+stud2.getBatch().getFaculty().getFid()+"\t"+stud2.getBatch().getFaculty().getFname()+"\t"+stud2.getBatch().getFaculty().getCourse().getCid()+"\t"+stud2.getBatch().getFaculty().getCourse().getCname());
		System.out.println(stud3.getSid()+"\t"+stud3.getSname()+"\t"+stud3.getBatch().getBid()+"\t"+stud3.getBatch().getBname()+"\t"+stud3.getBatch().getFaculty().getFid()+"\t"+stud3.getBatch().getFaculty().getFname()+"\t"+stud3.getBatch().getFaculty().getCourse().getCid()+"\t"+stud3.getBatch().getFaculty().getCourse().getCname());
		System.out.println(stud4.getSid()+"\t"+stud4.getSname()+"\t"+stud4.getBatch().getBid()+"\t"+stud4.getBatch().getBname()+"\t"+stud4.getBatch().getFaculty().getFid()+"\t"+stud4.getBatch().getFaculty().getFname()+"\t"+stud4.getBatch().getFaculty().getCourse().getCid()+"\t"+stud4.getBatch().getFaculty().getCourse().getCname());

	}

}
