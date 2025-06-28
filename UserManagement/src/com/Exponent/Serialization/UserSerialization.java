package com.Exponent.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.Exponent.Entity.User;

public class UserSerialization {
	public static void serializeUser(User[] u) throws IOException {
		//User u=new User();
		FileOutputStream file=new FileOutputStream("Userdetails.txt");
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(u);
		System.out.println("File created");
	}

}
