package com.onlineshoppingsystem;

public class Electronics extends Product{
	int pid=101;
	String pName="Mobile";
	float pPrice=50000.56f;
	
@Override
void displayDetails() {
	// TODO Auto-generated method stub
	Electronics e=new Electronics();
	System.out.println(e.pid+"\t"+e.pName+"\t"+e.pPrice);
}
@Override
void calculateShippingCost() {
	// TODO Auto-generated method stub
	System.out.println("Shipping cost: Rs. 500");
}

}
