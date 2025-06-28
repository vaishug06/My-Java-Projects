package com.studentMgmtSys;

public class Student {
	int id;
	String name;
	String address;
	
	public Student(int sId, String sName, String sAddress) {
		id=sId;
		name=sName;
		address=sAddress;
	}
	
	public String toString() {
		String s="ID: "+id+" Name: "+name+" Address: "+address;
		return s;
	}
	

}
