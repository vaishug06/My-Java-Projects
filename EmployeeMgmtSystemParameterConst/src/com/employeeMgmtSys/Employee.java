package com.employeeMgmtSys;

public class Employee {
	int empid;
	String empname;
	double empsalary;
	
	public Employee(int id, String name, double sal) {
		empid=id;
		empname=name;
		empsalary=sal;
	}
	public String toString() {
		String s="Employee Details Employee ID.: "+empid+ " Name: "+empname+" Salary: "+empsalary;
			return s;
	}

}
