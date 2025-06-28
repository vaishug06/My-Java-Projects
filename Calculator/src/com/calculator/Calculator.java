package com.calculator;

public class Calculator {
	
	public void addition(int a, int b) {
		int c=a+b;
		System.out.println("Addition of two numbers: "+c);
	}
	
	public void substraction(int a, int b) {
		int c=a-b;
		System.out.println("Substractio  of two numbers: "+c);
	}
	
	public void multiplication(int a, int b) {
		int c=a*b;
		System.out.println("Multiplication of two numbers: "+c);
	}
	
	public void division(int a, int b) {
		float c=a/b;
		System.out.println("Division of two numbers: "+c);
	}
	
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int a=100;
		int b=5;
		
		cal.addition(a, b);
		cal.substraction(a, b);
		cal.multiplication(a, b);
		cal.division(a, b);
	}

}
