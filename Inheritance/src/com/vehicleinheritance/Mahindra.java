package com.vehicleinheritance;

public class Mahindra extends Car{
	float safetyRatings=4;
	String variant="XUV";
	
	public void companyName()
	{
		System.out.println("Company Name: Mahindra");
	}
	
	public void displayDetails() {
		System.out.println("Safety Rating:"+safetyRatings);
		
	}

}
