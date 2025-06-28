package com.singleinheritance;

public class ChildClass extends ParentClass{
	int cid=40;
	public void m2() {
		System.out.println("ChildClass method");
	}
	
	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		System.out.println(c.cid);
		System.out.println(c.pid);
		c.m1();
		c.m2();
		
		System.out.println("ParentClass----");
		ParentClass p=new ParentClass();
		System.out.println(p.pid);
		p.m1();
		}

}
