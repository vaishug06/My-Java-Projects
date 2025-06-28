package com.emp;

public class Company {
	public void displayEmployee(Employee e) {
		System.out.println(e.eid+" "+e.name+" "+e.salary);
		System.out.println();
	}
	
	public void displayAllEmployee(AllEmployee all) {
		System.out.println(all.e1.eid+" "+all.e1.name+" "+all.e1.salary);
		System.out.println();
		System.out.println(all.e2.eid+" "+all.e2.name+" "+all.e2.salary);
		System.out.println();
		System.out.println(all.e3.eid+" "+all.e3.name+" "+all.e3.salary);
	}
	
	public static void main(String[] args) {
		Department d=new Department();
		d.addEmployeedetails();
		d.addAllEmployeeDetails();
	}

}
