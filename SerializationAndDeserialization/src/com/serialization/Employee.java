package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	

	private int eid;
	private String ename;
	private String eaddress;
	private int eaccno;
	private String password;
	private Company c;

	public Company getC() {
		return c;
	}

	public void setC(Company c) {
		this.c = c;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public int getEaccno() {
		return eaccno;
	}

	public void setEaccno(int eaccno) {
		this.eaccno = eaccno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", eaccno=" + eaccno
				+ ", password=" + password + ", c=" + c + "]";
	}
	

}
