package com.accessmodifiers2;
import com.accesmodifiersexample.*;

public class ProtectedDemo2 extends ProtectedTest{
	public static void main(String[] args) {
		ProtectedTest t=new ProtectedTest();
		/*
		 * System.out.println("Parent Object"); System.out.println(t.id+" "+t.name);
		 * ProtectedTest d=new ProtectedDemo2(); System.out.println("Mixed Object");
		 * System.out.println(d.id+" "+d.name);
		 */
		ProtectedDemo2 d1=new ProtectedDemo2();
		System.out.println("Child Object");
		System.out.println(d1.id+" "+d1.name);
	}

}
