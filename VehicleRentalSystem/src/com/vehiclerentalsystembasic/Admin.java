package com.vehiclerentalsystembasic;

public class Admin {
	public static void main(String[] args) {
		Car c = new Car();
		int time = 5;
		float time1 = 5.5f;
		float price = c.bookVehicle(time);
		System.out.println("Total price for car (for days): " + c.calculateRentalPrice(price, time));
		float price2 = c.bookVehicle(time1);
		System.out.println("Total price for car(for hrs): " + c.calculateRentalPrice(price2, time1));
		/*
		 * float price3=c.bookVehicle("Pune");
		 * System.out.println("Total price: "+c.calculateRentalPrice(price3, time));
		 */
		Bike b = new Bike();

		float price4 = b.bookVehicle(time);
		System.out.println("Total price for bike (for days): " + b.calculateRentalPrice(price, time));
		float price5 = b.bookVehicle(time1);
		System.out.println("Total price for bike (for hrs): " + b.calculateRentalPrice(price2, time1));
		/*
		 * float price3=c.bookVehicle("Pune");
		 * System.out.println("Total price: "+c.calculateRentalPrice(price3, time));
		 */

	}

}
