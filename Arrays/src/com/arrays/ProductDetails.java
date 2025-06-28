package com.arrays;

public class ProductDetails {

	public Order[] addOrder() {
		Order o = new Order();
		o.setOid(101);
		o.setOname("ABC");
		o.setOdate("30/1/2025");
		Order o1 = new Order();
		o1.setOid(102);
		o1.setOname("PQR");
		o1.setOdate("31/1/2025");
		Order o2 = new Order();
		o2.setOid(103);
		o2.setOname("XYZ");
		o2.setOdate("31/1/2025");
		Order[] order = { o, o1, o2 };
		return order;

	}

	public Product[] addProduct() {
		Product p = new Product();
		p.setPid(1001);
		p.setPname("XYZ");
		p.setPrice(500.00);
		Product p1 = new Product();
		p1.setPid(1002);
		p1.setPname("PQR");
		p1.setPrice(700.00);
		Product p2 = new Product();
		p2.setPid(1003);
		p2.setPname("ABC");
		p2.setPrice(1000.00);

		Product[] product = { p, p1, p2 };
		return product;

	}

	public Customer[] addCustomer() {
		Customer c = new Customer();
		c.setCname("abc");
		c.setContact(103046746);
		c.setCemail("abc@gmail.com");
		Customer c1 = new Customer();
		c1.setCname("pqr");
		c1.setContact(103046770);
		c1.setCemail("pqr@gmail.com");
		Customer c2 = new Customer();
		c2.setCname("xyz");
		c2.setContact(6486587965l);
		c2.setCemail("xyz@gmail.com");
		Customer[] customer = { c, c1, c2 };
		return customer;
	}

}
