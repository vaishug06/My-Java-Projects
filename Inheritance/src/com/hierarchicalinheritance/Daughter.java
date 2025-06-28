package com.hierarchicalinheritance;

public class Daughter extends Father{
	int dage=20;
	String dName="Pqr";
	
	public void m3() {
		System.out.println("m3 method from Daughter class");
	}
	
	public static void main(String[] args) {
		Daughter c=new Daughter();
		System.out.println("Daughter class + Father class called");
		System.out.println(c.fage);
		System.out.println(c.dName);
		System.out.println(c.dage);
		System.out.println(c.dName);
		c.m1();
		c.m3();
		System.out.println();
		
		System.out.println("Son class + Father class called" );
		Son b=new Son();
		System.out.println(b.fage);
		System.out.println(b.fName);
		System.out.println(b.sage);
		System.out.println(b.sName);
		b.m1();
		b.m2();
		System.out.println();
		
		System.out.println("Father class called");
		Father a=new Father();
		System.out.println(a.fage);
		a.m1();
	}

}
