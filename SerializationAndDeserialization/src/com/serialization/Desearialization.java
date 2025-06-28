package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Desearialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file=new FileInputStream("employeedetails.txt");
		ObjectInputStream obj=new ObjectInputStream(file);
		Employee e=(Employee) obj.readObject();
		Company c=(Company) obj.readObject();
		System.out.println(e);
		//System.out.println(c);
	}
}
