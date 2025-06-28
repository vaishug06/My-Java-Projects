package com.UserMangement;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializations {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream file=new FileInputStream("userdetails.txt");
		ObjectInputStream obj=new ObjectInputStream(file);
		User u=(User)obj.readObject();
		System.out.println(u);
		
	}

}
