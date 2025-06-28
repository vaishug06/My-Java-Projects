package com.staticexample;

public class Test {
	public static void m1() {
		System.out.println("static method");
		Test t1=new Test();
		System.out.println(Student.collegeName);
		t1.m2();
	}
	
	public void m2() {
		System.out.println("Non static method");
		System.out.println(Student.collegeName);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.id = 101;
		s.name = "Abc";
		System.out.println(s.id + " " + s.name + " " + Student.collegeName);
		Student s1 = new Student();
		s1.id = 102;
		s1.name = "Pqr";
		System.out.println(s1.id + " " + s1.name + " " + Student.collegeName);
		m1();
		Test t=new Test();
		t.m2();

	}

}
