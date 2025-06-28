package com.vehiclerentalsystem;

import java.util.*;
/*
Create a Vehicle Rental System where a Vehicle class 
has an overloaded bookVehicle() method that allows booking
by days, hours, or location. The Car and Bike subclasses
override the calculateRentalPrice() 
method to apply specific rental pricing strategies.*/

public class Vehicle {

	public float bookVehicle(int days) {
		float dailyprice = 3000;
		return dailyprice;

	}

	public float bookVehicle(float hrs) {
		float hrlyprice = 500;
		return hrlyprice;

	}

	public float bookVehicle(String location) {

		float locprice = 5000;
		return locprice;
	}

	public float calculateRentalPrice(float chrgs, float time) {
		float total = chrgs * time;
		return total;

	}

}
