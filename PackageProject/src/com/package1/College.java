package com.package1;

import com.package2.Students;
public class College {
	public static void main(String[] args) {
		System.out.println("Application started-----");
		Students s=new Students();
		System.out.println("Name:"+s.name);
		System.out.println("Roll No.: "+s.rollNo);
		s.m1();
		System.out.println("Application end-------");
	}

}
