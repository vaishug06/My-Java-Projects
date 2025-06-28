package com.employeemgmtsys;

public class Tester extends Employee{
	private int noOfBugs;
	public void setNoOfBugs(int bugs) {
		noOfBugs=bugs;
	}

	public int retNoOfBugs() {
		return noOfBugs;
	}
	
	@Override
	public void displayEmployeeDetails() {
		super.displayEmployeeDetails();
		System.out.println("Number of Bugs: "+noOfBugs);
	}
}
