package com.ExceptionHandling;

public class Execp {
	public static void main(String[] args) {
		System.out.println("line 1");
		System.out.println("line 2");
		System.out.println("line 3");
		System.out.println("line 4");
		try {
			int n=10/0;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception Handled: "+e);
			
		}
		finally {
			System.out.println("Finally block");
			System.exit(0);
		}
		System.out.println("line 5");
		System.out.println("line 6");
		System.out.println("line 7");
	}

}
