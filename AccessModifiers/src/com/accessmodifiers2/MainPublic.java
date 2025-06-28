package com.accessmodifiers2;
import com.accesmodifiersexample.*;

public class MainPublic {

	public static void main(String[] args) {
		PublicTest pt=new PublicTest();
		System.out.println(pt.testid);
		pt.m3();
	}
}
