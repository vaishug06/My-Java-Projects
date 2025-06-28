package com.vehicleinheritance;

public class Test {
	public static void main(String[] args) {
		Harrier h=new Harrier();
		h.companyName();
		h.details();
		h.displayDetails();
		System.out.println(h.hassunRoof);
		System.out.println(h.noOfAirBags);
		System.out.println(h.noOfDoors);
		System.out.println(h.noOfSeats);
		System.out.println(h.noOfWheels);
		System.out.println(h.safetyRatings);
		System.out.println(h.seatingCapacity);
		h.playMusic();
		h.stopMusic();
		h.startEngine();
		h.stopEngine();
		System.out.println();
		
		
		Nexon n=new Nexon();
		n.companyName();
		n.details();
		n.displayDetails();
		System.out.println("Has Touch display: "+n.hastouchScreenDisplay);
		System.out.println("No. of Doors: "+n.noOfDoors);
		System.out.println("No. of seats:" +n.noOfSeats);
		System.out.println("No. fo wheels"+n.noOfWheels);
		System.out.println("Safety Rating:"+n.safetyRatings);
		System.out.println("Setaing capacity"+n.seatingCapacity);
		n.playMusic();
		n.stopMusic();
		n.startEngine();
		n.stopEngine();
		System.out.println();
		
		Safari s=new Safari();
		s.companyName();
		s.details();
		s.displayDetails();
		System.out.println(s.modelNo);
		System.out.println(s.noOfDoors);
		System.out.println(s.noOfSeats);
		System.out.println(s.noOfWheels);
		System.out.println(s.safetyRatings);
		System.out.println(s.seatingCapacity);
		s.playMusic();
		s.stopMusic();
		s.startEngine();
		s.stopEngine();
		System.out.println();
		
		Xuv700 x=new Xuv700();
		x.companyName();
		x.details();
		x.displayDetails();
		System.out.println(x.hasTouchscreenDisplay);
		System.out.println(x.noOfAirBags);
		System.out.println(x.noOfDoors);
		System.out.println(x.noOfSeats);
		System.out.println(x.noOfWheels);
		System.out.println(x.safetyRatings);
		System.out.println(x.seatingCapacity);
		h.playMusic();
		h.stopMusic();
		h.startEngine();
		h.stopEngine();
		System.out.println();
		
		Scorpio s1=new Scorpio();
		s1.companyName();
		s1.details();
		s1.displayDetails();
		System.out.println(s1.noOfDoors);
		System.out.println(s1.noOfSeats);
		System.out.println(s1.noOfWheels);
		System.out.println(s1.safetyRatings);
		System.out.println(s1.seatingCapacity);
		s1.playMusic();
		s1.stopMusic();
		s1.startEngine();
		s1.stopEngine();
		System.out.println();
	}

}
