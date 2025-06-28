package com.onlineshoppingsystem;

public class Admin {
public static void main(String[] args) {
	System.out.println("ProdId ProdName Price");
	Product p1=new Electronics();
	p1.displayDetails();
	p1.calculateShippingCost();
	System.out.println();
	Product p2=new Clothing();
	p2.displayDetails();
	p2.calculateShippingCost();
	System.out.println();
	Product p3=new Groceries();
	p3.displayDetails();
	p3.calculateShippingCost();
}

}
