package com.onlineshoppingsystem;

public class Groceries extends Product {
	int pid = 103;
	String pName = "Rice 10Kg";
	float pPrice = 650;

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		Groceries g = new Groceries();
		System.out.println(g.pid + "\t" + g.pName + " " + g.pPrice);
	}
	@Override
	void calculateShippingCost() {
		// TODO Auto-generated method stub
		System.out.println("Shipping cost: Rs. 200");
	}
}

