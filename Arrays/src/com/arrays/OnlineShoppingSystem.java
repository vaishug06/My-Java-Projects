package com.arrays;

public class OnlineShoppingSystem {
	public static void main(String[] args) {
		ProductDetails product=new ProductDetails();
		System.out.println("---------Order Details---------");
		System.out.println("OId\tOName\tODate");
		Order[] o=product.addOrder();
		System.out.println(o[0].getOid()+"\t"+o[0].getOname()+"\t"+o[0].getOdate());
		System.out.println(o[1].getOid()+"\t"+o[1].getOname()+"\t"+o[1].getOdate());
		System.out.println(o[2].getOid()+"\t"+o[2].getOname()+"\t"+o[2].getOdate());
		System.out.println("--------Product Details-------");
		System.out.println("Id\tName\tPrice");
		Product[] p= product.addProduct();
		System.out.println(p[0].getPid()+"\t"+p[0].getPname()+"\t"+p[0].getPid());
		System.out.println(p[1].getPid()+"\t"+p[1].getPname()+"\t"+p[1].getPid());
		System.out.println(p[2].getPid()+"\t"+p[2].getPname()+"\t"+p[2].getPid());
		System.out.println("-------Customer Details-----");
		System.out.println("Name\tContact \tEmail");
		Customer[] c=product.addCustomer();
		System.out.println(c[0].getCname()+"\t"+c[0].getContact()+"\t"+c[0].getCemail());
		System.out.println(c[1].getCname()+"\t"+c[1].getContact()+"\t"+c[1].getCemail());
		System.out.println(c[2].getCname()+"\t"+c[2].getContact()+"\t"+c[2].getCemail());
		
		
	}

}
