package com.employeemgmtsys;

public class Developer extends Employee{
	String progmLang;
	public void setProgmLang(String lang) {
		progmLang=lang;
	}
	public String getProgmLang() {
		return progmLang;
	}
	
	@Override
	public void displayEmployeeDetails() {
		super.displayEmployeeDetails();
		System.out.println("Programming Language:"+progmLang);
		
	}

}
