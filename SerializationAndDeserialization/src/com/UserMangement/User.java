package com.UserMangement;


import java.io.Serializable;

public class User implements Serializable{
	private int uid;
	private String uname;
	private String uaddress;
	private String usergender;
	private double userSalary;
	private long phno;

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uaddress=" + uaddress + ", usergender=" + usergender
				+ ", userSalary=" + userSalary + ", phno=" + phno + "]";
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public double getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(double userSalary) {
		this.userSalary = userSalary;
	}

}
