package com.vehiclerentalsystem;

public class Car extends Vehicle {
	@Override
	public float calculateRentalPrice(float chrgs, float time) {
		// TODO Auto-generated method stub
		float car = 2500;
		float subtotal = super.calculateRentalPrice(chrgs, time);
		float total = car + subtotal;
		return total;
	}
}
