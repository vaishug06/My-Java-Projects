package com.calculator;

public class Calculator2 {
	public int addition(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public int substraction(int a, int b) {
		int c=a-b;
		return c;
	}
	
	public int multiplication(int a, int b) {
		int c=a*b;
		return c;
	}
	
	public float division(int a, int b) {
		float f=a/b;
		return f;
	}
	
	public static void main(String[] args) {
		Calculator2 c=new Calculator2();
		int a=100;
		int b=5;
		int d=c.addition(a, b);
		System.out.println("Addition of two numbers "+d);
		int e=c.substraction(a, b);
		System.out.println("Substraction of two numbers "+e);
		int f=c.multiplication(a, b);
		System.out.println("Multiplication of two numbers "+f);
		float g=c.division(a, b);
		System.out.println("Division of two numbers "+g);
		
	}

}
