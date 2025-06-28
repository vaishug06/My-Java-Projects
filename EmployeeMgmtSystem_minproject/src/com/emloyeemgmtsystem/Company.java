package com.emloyeemgmtsystem;

public class Company {
	public static void main(String[] args) {
		Department dept=new Department();
		Employee emp=dept.addEmployeeDetails();
		System.out.println("Id:"+emp.id);
		System.out.println("Name: "+emp.name);
		System.out.println("Salary: "+emp.salary);
		System.out.println();
		AllEmployeeDetails aed1=dept.addAllEmployeeDetails();
		System.out.println("Id:"+aed1.pqr.id);
		System.out.println("Name: "+aed1.pqr.name);
		System.out.println("Salary: "+aed1.pqr.salary);
		System.out.println();
		System.out.println("Id:"+aed1.xzy.id);
		System.out.println("Name: "+aed1.xzy.name);
		System.out.println("Salary: "+aed1.xzy.salary);
		System.out.println();
		System.out.println("Id:"+aed1.efg.id);
		System.out.println("Name: "+aed1.efg.name);
		System.out.println("Salary: "+aed1.efg.salary);
		System.out.println();
		
		
	}

}
