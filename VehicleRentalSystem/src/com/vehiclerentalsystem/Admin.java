package com.vehiclerentalsystem;

import java.util.*;

public class Admin {
	public static void main(String[] args) {

		System.out.println("Select booking type:");
		System.out.println("1. Book Hourly");
		System.out.println("2. Book by no. of days");
		System.out.println("3. By Location");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			// Car c=new Car();
			System.out.println("Enter no. of hours:");
			float hrs = sc.nextFloat();
			System.out.println("Selct vehicle:\n 1. Car\n 2. Bike");
			int ch2 = sc.nextInt();
			if (ch2 == 1) {
				Car c = new Car();

				float price = c.bookVehicle(hrs);
				System.out.println("Total Cost: " + c.calculateRentalPrice(price, hrs));
			} else if (ch2 == 2) {
				Bike b = new Bike();

				float price = b.bookVehicle(hrs);
				System.out.println("Total Cost: " + b.calculateRentalPrice(price, hrs));
			}
			
			else {
				System.out.println("Incorrect Option");
			}
			break;

		case 2:
			/*
			 * Bike b=new Bike();
			 */
			System.out.println("Enter no. of days:");
			int days = sc.nextInt();
			System.out.println("Selct vehicle:\n 1. Car\n 2. Bike");
			int ch3 = sc.nextInt();
			if (ch3 == 1) {
				Car c = new Car();

				float price = c.bookVehicle(days);
				System.out.println("Total Cost: " + c.calculateRentalPrice(price, days));
			} else if (ch3 == 2) {
				Bike b = new Bike();

				float price = b.bookVehicle(days);
				System.out.println("Total Cost: " + b.calculateRentalPrice(price, days));
			}
			
			else {
				System.out.println("Incorrect Option");
			}
			
			break;
			
		/*
		 * case 3: System.out.println("Enter location:"); String loc=sc.nextLine();
		 * System.out.println("Selct vehicle:\n 1. Car\n 2. Bike"); int ch4 =
		 * sc.nextInt(); if (ch4 == 1) { Car c = new Car();
		 * 
		 * float price = c.bookVehicle(loc); System.out.println("Total Cost: " +
		 * c.calculateRentalPrice(price, 0)); } else if (ch4 == 2) { Bike b = new
		 * Bike();
		 * 
		 * float price = b.bookVehicle(loc); System.out.println("Total Cost: " +
		 * b.calculateRentalPrice(price, 0)); }
		 * 
		 * else { System.out.println("Incorrect Option"); }
		 * 
		 * 
		 * break;
		 */
			

		default:
			System.out.println("Invalid Option");
			break;
		}
		sc.close();
	}

}
