package com.datatypes;

public class DataTypesExample {
	//Integer
	//byte //range -128 - 127
	byte b=100; 
	byte b1;
	//short // range 
	short s=12334;
	short s1;
	//int
	int i=1474;
	int i1;
	//long
	long l=1479695;
	long l1;
	//floating
	//float
	float f=146.98f;
	float f1;
	//double
	double d=135.86643;
	double d1;
	//boolean
	boolean bool=true;
	boolean bool1;
	//characters
	char c='A';
	char c1;
	
	public static void main(String[] args) {
		DataTypesExample dt=new DataTypesExample();
		System.out.println("Default values");
		System.out.println("Byte:"+dt.b1);
		System.out.println("Short:"+dt.s1);
		System.out.println("Int: "+dt.i1);
		System.out.println("Long: "+dt.l1);
		System.out.println("Float: "+dt.f1);
		System.out.println("Double: "+dt.d1);
		System.out.println("Boolean: "+dt.bool1);
		System.out.println("char: "+dt.c1);
		System.out.println("Assigned values");
		System.out.println("Byte:"+dt.b);
		System.out.println("Short:"+dt.s);
		System.out.println("Int: "+dt.i);
		System.out.println("Long: "+dt.l);
		System.out.println("Float: "+dt.f);
		System.out.println("Double: "+dt.d);
		System.out.println("Boolean: "+dt.bool);
		System.out.println("char: "+dt.c);
		System.out.println("char: "+dt.c);
	}

}
