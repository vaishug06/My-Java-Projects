package com.accesmodifiersexample;

public class PublicDemo {
	public static void main(String[] args) {
		PublicTest p=new PublicTest();
		System.out.println(p.testid);
		p.m3();
	}

}
