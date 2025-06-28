package com.employeeMgmtSys;

public class Company {
	public void displayEmpDetails() {
		Department d=new Department();
		Employee e= d.addEmpDetails();
		
		System.out.println(e);
	}
	
	public void displayAllEmpDetails() {
		Department d=new Department();
		AllEmployee all=d.addAllEmpDetails();
		System.out.println(all.e1);
		System.out.println(all.e2);
		System.out.println(all.e3);
	}
	
	public static void main(String[] args) {
		Company company=new Company();
		System.out.println("Id\t Name\t Salary");
		company.displayEmpDetails();
		company.displayAllEmpDetails();
	}

}
