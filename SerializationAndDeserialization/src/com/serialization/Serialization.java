package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialization {

	public static void main(String[] args) throws IOException {
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID:");
		emp.setEid(sc.nextInt());
		System.out.println("Enter employee Name:");
		emp.setEname(sc.next());
		System.out.println("Enter employee Address:");
		emp.setEaddress(sc.next());
		System.out.println("Enter employee account no:");
		emp.setEaccno(sc.nextInt());
		System.out.println("Enter employee password:");
		emp.setPassword(sc.next());
		Company c=new Company();
		c.setCid(101);
		c.setCname("Abc");
		c.setCaddress("Pune");
		emp.setC(c);
		
		FileOutputStream file=new FileOutputStream("employeedetails.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(emp);
		obj.writeObject(c);
		System.out.println("File created");
	}
}
