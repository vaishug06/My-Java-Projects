package com.Exponent.BankApplication.Validations;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validations {
	static Scanner sc = new Scanner(System.in);

	public static String validateAccountHolderName() {
		System.out.println("Enter Name:");

		String name = sc.next();

		/*
		 * for (int i = 0; i < name.length(); i++) { if ((name.charAt(i) >= 'A' &&
		 * name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')) {
		 * return name; } else { System.out.println("invali"); return
		 * validateAccountHolderName(); } }
		 */
		// return name;

		if (Pattern.matches("[A-Za-z]+", name)) {
			return name;
		} else {
			System.out.println("Invalid Input!");
			return validateAccountHolderName();
		}

	}

	public static String validateAdhaarNo() {
		System.out.println("Enter Adhaar No.: ");
		String adhaarno = sc.next();
		if (Pattern.matches("[0-9]+", adhaarno) && adhaarno.length() == 12) {
			return adhaarno;
		} else {
			System.out.println("Invalid Input");
			return validateAdhaarNo();
		}
	}

	public static String validatePanNo() {
		System.out.println("Enter PAN No.: ");
		String panNo = sc.next();
		if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panNo)) {
			return panNo;
		} else {
			System.out.println("Invalid input!");
			return validatePanNo();
		}

	}

	public static long validatePhoneNo() {
		System.out.println("Enter Contact No.:");
		long contactNo = validateContactNo();
		// System.out.println("Enter country code: ");
		/*
		 * String code=sc.next(); String phoneno=code.concat(contactNo);
		 */

		
		/*
		 * if (Pattern.matches("[0-9]{10}", contactNo)) { return contactNo; } else {
		 * System.out.println("Invalid Input!"); return validatePhoneNo(); }
		 */
		
		return contactNo;

	}

	public static long validateContactNo() {
		// TODO Auto-generated method stub
		System.out.println("Enter contact Number");
		long cont;
		try {
			cont=sc.nextLong();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid Choice"+e);
			return validateContactNo();
		}
		return cont;
	}

	public static String validateEmail() {
		System.out.println("Enter Email:");
		String email = sc.next();
		if (Pattern.matches("[A-Za-z0-9]+@[A-Za-z]+(.[a-zA-Z])+", email)) {
			return email;
		} else {
			System.out.println("Invalid Input!");
			return validateEmail();
		}

	}

	public static double validateBalance() {
		System.out.println("Enter Account opening balance: ");
		double balance = sc.nextDouble();
		if (balance > 0) {
			return balance;
		} else {
			System.out.println("Invalid Input!");
			return validateBalance();
		}

	}

}
