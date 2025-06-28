package com.Exponent.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.Exponent.Entity.User;

public class Deserializations {
	public static void deserializeUser() throws IOException, ClassNotFoundException {
		FileInputStream file=new FileInputStream("Userdetails.txt");
		ObjectInputStream obj=new ObjectInputStream(file);
		User[] u=(User[])obj.readObject();
		for (User user : u) {
			if(user!=null) {
				System.out.println(user);
				System.out.println("------------------------------------------");	
			}
			
		}
	}
	

}
