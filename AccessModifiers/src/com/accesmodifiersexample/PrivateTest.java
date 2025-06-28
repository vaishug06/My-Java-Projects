package com.accesmodifiersexample;

public class PrivateTest {
	private int pid=200;
	
	private PrivateTest() {
		
	}
	
	private void m1() {
		System.out.println("Private method m2");
	}
	
	public static void main(String[] args) {
		PrivateTest p=new PrivateTest();
		System.out.println(p.pid);
		p.m1();
	}

}
