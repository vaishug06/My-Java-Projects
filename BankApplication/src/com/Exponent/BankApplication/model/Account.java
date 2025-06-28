package com.Exponent.BankApplication.model;

public class Account {
	private int accountNo;
	private String accountName;
	private String adhaarno;
	private String pancard;
	private long contactNo;
	private String mail;
	private double accountBalance;

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAdhaarno() {
		return adhaarno;
	}

	public void setAdhaarno(String adhaarno) {
		this.adhaarno = adhaarno;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo1) {
		long contactNo = contactNo1;
		this.contactNo = contactNo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		/*
		 * return "Account [accountNo=" + accountNo + ", accountName=" + accountName +
		 * ", adhaarno=" + adhaarno + ", pancard=" + pancard + ", contactNo=" +
		 * contactNo + ", mail=" + mail + ", accountBalance=" + accountBalance + "]";
		 */
		return "Account Details---------------:\nAccount No.: " + accountNo + "\nAccount Holder Name: " + accountName
				+ "\nAdhaar No.: " + adhaarno + "\nPAN No.: " + pancard + "\nContat No.: " + contactNo + "\nE-mail: "
				+ mail + "\nBalance: " + accountBalance;

	}

}
