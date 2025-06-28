package com.methodoverride;

public class C extends B{

	@Override
	public void m2() {
		System.out.println("m2 method Overrided from class C");
	}
	
	@Override
	public void m4() {
		System.out.println("m4 method Overrided from class C");
	}
	
	
	public void m6() {
		System.out.println("m6 method from class C");
	}
}
