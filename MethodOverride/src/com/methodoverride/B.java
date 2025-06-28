package com.methodoverride;

public class B extends A{
	@Override
	public void m2() {
		System.out.println("m2 method Overrided from class B");
	}
	
	@Override
	public void m3() {
		System.out.println("m3 method Overrided from class B");
	}
	
	public void m4() {
		System.out.println("m4 method from class B");
	}
	
	public void m5() {
		System.out.println("m5 method from class B");
	}
}
