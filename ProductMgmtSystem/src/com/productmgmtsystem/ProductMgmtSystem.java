package com.productmgmtsystem;

public class ProductMgmtSystem {
	public Product addProductDetails() {
		Product product=new Product();
		product.pId=1001;
		product.pName="Mobile";
		return product;
	}
	
	public Order addOrderDetails() {
		Order order=new Order();
		order.oId=2001;
		order.oName="Abc";
		order.date="20 Jan 2025";
		order.oPrice=40000;
		return order;
	}
	
	public Customer addCustomerDetails() {
		Customer customer=new Customer();
		customer.cId=50001;
		customer.cName="Xyz";
		customer.emailId="xyz@gmail.com";
		customer.contactNo=9767902055l;
		return customer;
	}
	
	public static void main(String[] args) {
		ProductMgmtSystem pms=new ProductMgmtSystem();
		Product p=pms.addProductDetails();
		System.out.println("Product Details:");
		System.out.println(p.pId+" "+p.pName);
		Order o=pms.addOrderDetails();
		System.out.println("Order Details:");
		System.out.println(o.oId+" "+o.oName+" "+o.date+" "+o.oPrice);
		Customer c=pms.addCustomerDetails();
		System.out.println("Customer Details:");
		System.out.println(c.cId+" "+c.cName+" "+c.address+" "+c.emailId+" "+c.contactNo);
		
	}

}
