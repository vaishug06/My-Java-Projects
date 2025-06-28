package com.Exponent.ServiceImplementation;

import java.io.IOException;
import java.util.Scanner;

import com.Exponent.Entity.User;
import com.Exponent.Serialization.Deserializations;
import com.Exponent.Serialization.UserSerialization;
import com.Exponent.Service.UserService;

public class UserServiceImpl implements UserService{
	
	User[] u=new User[5];

	Scanner sc=new Scanner(System.in);
	@Override
	public void addUser() {
		System.out.println("Enter number of users to add :- ");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			User user=new User();
			System.out.println("Enter user Id :-");
			user.setUid(sc.nextInt());
			System.out.println("Enter user Name :-");
			user.setUname(sc.next());
			System.out.println("Enter user Address :-");
			user.setUaddress(sc.next());
			System.out.println("Enter user Gender :-");
			user.setUsergender(sc.next());
			System.out.println("Enter user Salary :-");
			user.setUserSalary(sc.nextDouble());
			System.out.println("Enter user Contact No. :-");
			user.setPhno(sc.nextLong());
			u[i]=user;
			System.out.println("User added Successfully!");
			
		}
		
	}

	@Override
	public void displayAllUser() {
		for (User user : u) {
			if(user!=null) {
				System.out.println(user);
			}
		}
		
	}

	@Override
	public void displaySingleUser() {
		System.out.println("Enter User ID:");
		int id=sc.nextInt();
		for (User user : u) {
			if((user!=null) && (user.getUid()==id)) {
				System.out.println(user);
			}
			
		}
		
	}

	@Override
	public void updateUserDetails() {
		boolean flag=true;
		System.out.println("Enter user Id:");
		int id=sc.nextInt();
		for(User user: u) {
			if((user!=null) && (user.getUid()==id)) {
				while(flag) {
					System.out.println("Select one option: ");
					System.out.println("1. Update Name");
					System.out.println("2. Update Address");
					System.out.println("3. Update Salary");
					System.out.println("4. Update Contact No.");
					System.out.println("5. Exit");
					int ch=sc.nextInt();
					switch (ch) {
					case 1:
						System.out.println("Enter name:");
						user.setUname(sc.next());
						System.out.println("Name Updated: "+user.getUname());
						break;
					case 2:
						System.out.println("Enter Address:");
						user.setUaddress(sc.next());
						System.out.println("Name Updated: "+user.getUaddress());
						break;
					case 3:
						System.out.println("Enter Salary:");
						user.setUserSalary(sc.nextDouble());
						System.out.println("Name Updated: "+user.getUserSalary());
						break;
					case 4:
						System.out.println("Enter Contact No.:");
						user.setPhno(sc.nextLong());
						System.out.println("Name Updated: "+user.getPhno());
						break;
					case 5:
						flag =false;
						break;
					default:
						System.out.println("Invalid Option! ");
					}
				}
			}
			
		}
		
		
		
	}

	@Override
	public void deleteUser() {
		System.out.println("Enter User ID to delete :- ");//3 0->101 1->102 2->103
		int id=sc.nextInt();//102
		int index=0;
		boolean flag=true;
		for(int i=0; i<u.length; i++) {
			if((u[i]!=null)&& (u[i].getUid()==id)){
				index=i;//index=1
				break;
			}
		}
		u[index]=null;// u[1]=null
		System.out.println("Account Deleted!");
		
		
	}

	@Override
	public void serialize() throws IOException {
		UserSerialization.serializeUser(u);
		
	}

	@Override
	public void deserialize() throws ClassNotFoundException, IOException {
		Deserializations.deserializeUser();
		
	}
	
	
	

}
