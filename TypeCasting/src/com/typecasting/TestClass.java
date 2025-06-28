package com.typecasting;

public class TestClass {
	public P testMethod() {
		R r=new R();
		return r;
	}
	
	public static void main(String[] args) {
		TestClass t=new TestClass();
		R r1=(R)t.testMethod();
		System.out.println(r1.i);
		r1.m1();
		System.out.println(r1.j);
		r1.m2();
		System.out.println(r1.k);			
		r1.m3();
	}

}
