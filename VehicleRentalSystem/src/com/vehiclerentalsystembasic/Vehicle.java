package com.vehiclerentalsystembasic;

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
