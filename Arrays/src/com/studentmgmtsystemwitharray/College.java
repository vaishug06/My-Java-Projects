package com.studentmgmtsystemwitharray;

import java.util.*;

public class College {
	public Student[] addStudent() {
		Student[] stud=new Student[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < stud.length; i++) {
			stud[i]=new Student();
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			stud[i].setSid(id);
			sc.nextLine();
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			stud[i].setSname(name);
			System.out.println("Enter Address:");
			String addr = sc.nextLine();
			stud[i].setSaddress(addr);
		}
		sc.close();
		return stud;
	}

	

}
