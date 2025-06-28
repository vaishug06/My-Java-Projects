package com.package2;

public class Students {
	public int rollNo = 10;
	public String name = "Abc";

	public void m1() {
		System.out.println("m1 method from Student class");
		Details d = new Details();
		System.out.println("Marks: " + d.marks);
		d.printResult();
	}

}
