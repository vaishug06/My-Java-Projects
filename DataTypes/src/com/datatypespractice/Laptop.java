package com.datatypespractice;

public class Laptop {
	byte ramSlot=2;
	short storage=512;
	int modelNo=123456;
	long serialNo=1234567890l;
	float screenSize=32.5f;
	double processorSpeed=2.65;
	char osType='w';
	boolean isScreenTouch=false;
	String companyName="Hp";
	
	public static void main(String[] args) {
		Laptop l=new Laptop();
		System.out.println("Company name:"+l.companyName);
		System.out.println("Model:"+l.modelNo);
		System.out.println("Serial No.:"+l.serialNo);
		System.out.println("Storage capacity:"+l.storage+"Gb");
		System.out.println("Sreen Size:"+l.screenSize);
		System.out.println("Processor speed:"+l.processorSpeed+"GHz");
		System.out.println("Numer of slots"+l.ramSlot);
		System.out.println("OS type:"+l.osType);
		System.out.println("Is screen touch:"+l.isScreenTouch);
	}

}
