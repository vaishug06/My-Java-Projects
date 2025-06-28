package com.vehiclerentalsystem;

public class Bike extends Vehicle {
	@Override
	public float calculateRentalPrice(float chrgs, float time) {
		// TODO Auto-generated method stub
		float bike = 250;
		float subtotal = super.calculateRentalPrice(chrgs, time);
		float total = bike + subtotal;
		return total;
	}

}
