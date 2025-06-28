package com.typecasting;

public class NarrowingCasting {//explicit typecasting
	public static void main(String[] args) {
		long l=1234;
		int i=(int)l;
		System.out.println(l);
		System.out.println(i);
		double d=2467.66654;
		float f=(float)d;
		System.out.println(d);
		System.out.println(f);
		
		char c='G';
		int i1=c;
		System.out.println(c+" "+i1);
		int i2=8809;
		char c1=(char)i2;
		System.out.println(c1+" "+i2);
	}

}
