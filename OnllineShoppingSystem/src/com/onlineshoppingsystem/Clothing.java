package com.onlineshoppingsystem;

public class Clothing extends Product{
	int pid=102;
	String pName="Jeans";
	float pPrice=1000.56f;
	
@Override
void displayDetails() {
	// TODO Auto-generated method stub
	Clothing c=new Clothing();
	System.out.println(c.pid+"\t"+c.pName+"\t"+c.pPrice);
}
@Override
void calculateShippingCost() {
	// TODO Auto-generated method stub
	System.out.println("Shipping cost: Rs. 300");
}

}
