package com.employeemgmtsys;

public class Manager extends Employee {
	 private int teamSize;
	 
	 
	
	public void setTeamSize(int size) {
		teamSize=size;
	}
	
	public int getTeamSize() {
		return teamSize;
	}
	
	@Override
	public void displayEmployeeDetails() {
		super.displayEmployeeDetails();
		System.out.println("Team Size:"+teamSize);
	}

}
