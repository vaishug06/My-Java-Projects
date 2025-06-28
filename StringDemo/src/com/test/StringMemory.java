package com.test;

public class StringMemory {

	public static void main(String[] args) {
		
		String s1= "Hi";
		String s2= new String("Hi");
		System.out.println(s1==s2);//false-- == equal to operator --
		System.out.println(s1.equals(s2));// 
		System.out.println(s2.equals(s1));
		
		// 
		String s3= "hi";
		System.out.println(s1==s3);//--
		String s4="hi";
		System.out.println(s3==s4);
		// 99.99 -- .equals ---
		
		// trim 
		
		
		
		
	}
	
	
}