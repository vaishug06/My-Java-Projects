package com.abstraction;

public class Demo extends Test {
	public Demo() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Demo constructor");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		Test t = new Demo();
		t.m1();
		t.m2();
		Demo d = new Demo();
		d.m1();
		d.m2();
	}

}
