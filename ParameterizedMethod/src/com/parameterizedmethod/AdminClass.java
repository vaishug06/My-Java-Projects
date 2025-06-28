package com.parameterizedmethod;

public class AdminClass {
	public void m1() {
		System.out.println("without parameter method");
	}
	
	public void m2(int i) {
		System.out.println("Single parameter method");
		System.out.println(i);		
	}
	
	public void m3(char c, long l) {
		System.out.println("two parameter method");
		System.out.println(c+" "+l);
	}
	
	public void m4(int a, float f, boolean b) {
		System.out.println("three parameter method");
		System.out.println(a+" "+f+" "+b);
	}
	
	public void m5(char a, char b, char c, char d) {
		System.out.println("four parameter method");
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	public void m6(byte s, double d) {
		System.out.println("Double parameter method");
		System.out.println(s+" "+d);
	}
	
	public void displayProduct(Product p) {
		System.out.println(p.pid+" "+p.pname+" "+p.price);
	}
	
	public void orderAndProductDetails(Order order,Product product, Product product1) {
		System.out.println(order.oid+" "+order.oname);
		System.out.println(product.pid+" "+product.pname+" "+product.price);
		System.out.println(product1.pid+" "+product1.pname+" "+product1.price);
	}
	
	public static void main(String[] args) {
		AdminClass a=new AdminClass();
		a.m1();
		a.m2(10);
		a.m3('A', 1000l);
		a.m4(100, 25.970f, true);
		a.m5('a', 'b', 'c', 'd');
		byte b=10;
		a.m6(b, 4564.47654);
		Product p=new Product();
		p.pid=1001;
		p.pname="Xyz";
		p.price=6046;
		
		Product p1=new Product();
		p1.pid=400;
		p1.pname="abc";
		p1.price=646;
		
		a.displayProduct(p);
		Order o=new Order();
		o.oid=146;
		o.oname="Abc";
		a.orderAndProductDetails(o, p, p1);
	}
}
