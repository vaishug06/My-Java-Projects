package com.accesmodifiersexample;

public class ProtectedDemo extends ProtectedTest{
	public static void main(String[] args) {
		System.out.println("----Parent Object----");
		ProtectedTest pt=new ProtectedTest();
		System.out.println(pt.id+" "+pt.name);
		pt.m1();
		
		System.out.println("----Mixed Object----");
		ProtectedTest p=new ProtectedDemo();
		System.out.println(p.id+" "+p.name);
		p.m1();
		
		System.out.println("----Child Object----");
		ProtectedDemo pd=new ProtectedDemo();
		System.out.println(pd.id+" "+pd.name);
		pd.m1();
	}

}
