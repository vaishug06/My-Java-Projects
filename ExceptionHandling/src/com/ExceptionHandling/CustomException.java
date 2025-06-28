package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CustomException {
	public static void m1()throws FileNotFoundException, NullPointerException {//->exeption declaration
		FileInputStream file=new FileInputStream("Abc.txt");
		String str=null;
		System.out.println(str.toLowerCase());
	}
	public static void main(String[] args) {
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handled in main method");
			e.printStackTrace();
		}//->exception handle code here
	}

}
