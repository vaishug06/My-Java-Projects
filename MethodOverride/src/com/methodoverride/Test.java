package com.methodoverride;

public class Test {
	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
		a.m2();
		a.m3();
		System.out.println();
		
		A a1=new B();//mixed objects: can be created in case of inheritance only.
		a1.m1();
		a1.m2();
		a1.m3();
		System.out.println();
		
		A a2=new C();
		a2.m1();
		a2.m2();
		a2.m3();
		System.out.println();
		
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		System.out.println();
		
		B b1=new C();
		b1.m1();
		b1.m2();
		b1.m3();
		b1.m4();
		b1.m5();
		System.out.println();
		
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
		c.m6();
	}

}
