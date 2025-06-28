package com.abstraction;

public abstract class Test {
	Test() {
		System.out.println("Test constructor");
	}

	public void m1() {
		System.out.println("m1 method");
	}

	public abstract void m2();

}
