package com.vehicleinheritance;

public class Tata extends Car{
	float safetyRatings=4.5f;
	String variant= "SUV";
	
	public void companyName()
	{
		System.out.println("Company Name: Tata");
	}
	
	public void displayDetails() {
		System.out.println("Safety Rating:"+safetyRatings);
		
	}
	

}
