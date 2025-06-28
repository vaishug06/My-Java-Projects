package com.accesmodifiersexample;

public class MainPrivateTest {
	public static void main(String[] args) {
		PrivateTest pt=new PrivateTest();
		System.out.println(pt.pid);
		pt.m1();
	}

}
