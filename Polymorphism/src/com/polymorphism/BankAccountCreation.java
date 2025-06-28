package com.polymorphism;

public class BankAccountCreation {
	public void createAccount(int i) {
		System.out.println("Savings Account");
	}

	private final void createAccount(int i, int j) {
		System.out.println("Current Account");

	}

	protected String createAccount(String s) {
		System.out.println("Joint Account");
		return "";
	}

	public static void main(String[] args) {
		BankAccountCreation b = new BankAccountCreation();
		b.createAccount(100);
		b.createAccount(100, 200);
		b.createAccount("Abc");

		main(10);
	}

	public static void main(int args) {
		System.out.println("Overloaded main method");

	}

}
