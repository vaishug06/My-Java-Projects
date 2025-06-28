package com.UserMangement;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializations {

	public static void main(String[] args) throws IOException {
		User u=new User();
		u.setUid(1);
		u.setUname("Abc");
		u.setUaddress("pune");
		u.setPhno(785654);
		u.setUsergender("M");
		u.setUserSalary(90234);
		
		FileOutputStream file=new FileOutputStream("userdetails.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(u);
		System.out.println("File created");
		
	}
}
