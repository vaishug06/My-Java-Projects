package com.ExceptionHandling;

public class ThrowException {
	public static void main(String[] args) {
		/*
		 * int age=15; if(age>=18) { System.out.println("Can vote"); } else { //throw
		 * new NullPointerException("Cannot vote"); throw new
		 * AgeException("Cannot vote"); }
		 */
		int a=10;
		int b=0;
		
		if(b==0) {
			throw new MathematicalException("Cannot divide by zero");
		}
		else {
			int n=a/b;
		}
		
	}

}
