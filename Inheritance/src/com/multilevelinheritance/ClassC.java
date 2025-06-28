package com.multilevelinheritance;

public class ClassC extends ClassB{
	int cid=80;
	
	public void m3() {
		System.out.println("m3 method from ClassC");
	}
	
	public static void main(String[] args) {
		ClassC c=new ClassC();
		System.out.println(c.aid);
		System.out.println(c.bid);
		System.out.println(c.cid);
		
		c.m1();
		c.m2();
		c.m3();
		
		System.out.println("ClassB-----");
		ClassB b=new ClassB();
		System.out.println(b.aid);
		System.out.println(b.bid);
		
		b.m1();
		b.m2();
		
		System.out.println("ClassA----");
		ClassA a=new ClassA();
		System.out.println(a.aid);
		a.m1();
	}

}
