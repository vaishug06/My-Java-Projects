package com.Exponent.Controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.Provider.Service;
import java.util.Scanner;

import com.Exponent.Entity.User;
import com.Exponent.Serialization.UserSerialization;
import com.Exponent.Service.UserService;
import com.Exponent.ServiceImplementation.UserServiceImpl;

public class AdminController {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		UserService us=new UserServiceImpl();
		
		boolean flag=true;
		while(flag) {
			System.out.println("Select Option");
			
			System.out.println("1. Add User");
			System.out.println("2. Display all user");
			System.out.println("3. Display single user");
			System.out.println("4. Update User details");
			System.out.println("5. Delete User");
			System.out.println("6. Serialize User");
			System.out.println("7. Deserialize User");
			System.out.println("8. Exit");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				us.addUser();
				break;
			case 2:
				us.displayAllUser();
				break;
			case 3:
				us.displaySingleUser();
				break;
			case 4:
				us.updateUserDetails();
				break;
			case 5:
				us.deleteUser();
				break;
			case 6:
				us.serialize();
				break;
			case 7:
				us.deserialize();
				break;
			case 8:
				flag =false;
				break;
			default:
				System.out.println("Invalid Option! ");
			}
		}
		
		
	}
	

}
