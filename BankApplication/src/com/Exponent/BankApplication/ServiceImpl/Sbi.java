package com.Exponent.BankApplication.ServiceImpl;

import java.util.Scanner;

import com.Exponent.BankApplication.Service.Rbi;
import com.Exponent.BankApplication.Validations.Validations;
import com.Exponent.BankApplication.model.Account;

public class Sbi implements Rbi {
	Account ac = new Account();
	Account[] a = new Account[5];
	Scanner sc = new Scanner(System.in);

	@Override
	public void createAccount() {
		System.out.println("Enter how many accounts you want to create: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter account number:");
			int accNo = sc.nextInt();
			Account ac = new Account();
			ac.setAccountNo(accNo);
			// System.out.println("Enter Name:");

			ac.setAccountName(Validations.validateAccountHolderName());
			// System.out.println("Enter Adhaar Number");
			ac.setAdhaarno(Validations.validateAdhaarNo());
			// System.out.println("Enter PAN Number:");
			ac.setPancard(Validations.validatePanNo());
			// System.out.println("Enter Contact Number:");
			ac.setContactNo(Validations.validateContactNo());
			// System.out.println("Enter Email:");
			ac.setMail(Validations.validateEmail());
			// System.out.println("Enter Account Opening Balance:");
			ac.setAccountBalance(Validations.validateBalance());
			a[i] = ac;
			System.out.println("Account opening successful!");
		}

	}

	@Override
	public void showAccountDetails() {
		/*
		 * System.out.println("Enter your account number:"); int accno = sc.nextInt();
		 * if (ac.getAccountNo() == accno) { System.out.println(ac); } else {
		 * System.out.println("Invalid account number!"); }
		 */
		for (Account acn : a) {
			if (acn != null) {
				System.out.println(acn);
			}

		}
	}

	@Override
	public void displayAccountBalance() {

		System.out.println("Enter your account number:");
		int accno = sc.nextInt();
		/*
		 * if (ac.getAccountNo() == accno) {
		 * 
		 * System.out.println("Your current balance is: " + ac.getAccountBalance()); }
		 * else { System.out.println("Invalid account number!"); }
		 */
		for (Account acn : a) {
			if ((acn != null) && (acn.getAccountNo() == accno)) {
				System.out.println("Your current balance is: " + acn.getAccountBalance());
			}

			/*
			 * else { System.out.println("Invalid account number!"); }
			 */

		}

	}

	@Override
	public void depositMoney() {
		System.out.println("Enter your account number:");
		int accno = sc.nextInt();
		/*
		 * if (ac.getAccountNo() == accno) {
		 * 
		 * System.out.println("Enter amount to be deposited:"); double amt =
		 * sc.nextDouble(); double totalamt = ac.getAccountBalance() + amt;
		 * ac.setAccountBalance(totalamt);
		 * System.out.println("Deposit successful!\n Your Current Balance is: " +
		 * ac.getAccountBalance()); } else {
		 * System.out.println("Invalid account number!"); }
		 */
		for (Account acn : a) {
			if ((acn != null) && (acn.getAccountNo() == accno)) {
				System.out.println("Enter amount to be deposited");
				double amt = sc.nextDouble();
				double totalamt = amt + acn.getAccountBalance();
				acn.setAccountBalance(totalamt);
				System.out.println("Deposit successful!\n Your Current Balance is: " + acn.getAccountBalance());
			} /*
				 * else { System.out.println("Account not found!"); }
				 */

		}

	}

	@Override
	public void withdrawMoney() {
		System.out.println("Enter your account number:");
		int accno = sc.nextInt();
		/*
		 * if (ac.getAccountNo() == accno) {
		 * 
		 * System.out.println("Enter amount to be withdrawn:"); double amt =
		 * sc.nextDouble(); if (ac.getAccountBalance() > amt) { double totalamt =
		 * ac.getAccountBalance() - amt; ac.setAccountBalance(totalamt);
		 * System.out.println("Deposit successful!\n Your Current Balance is: " +
		 * ac.getAccountBalance()); } else {
		 * System.out.println("Insufficient Balance!\nYour Current Balance is: " +
		 * ac.getAccountBalance()); } } else {
		 * System.out.println("Invalid account number!"); }
		 */
		for (Account acn : a) {
			if ((acn != null) && (acn.getAccountNo() == accno)) {
				System.out.println("Enter amount to be withdrawn");
				double amt = sc.nextDouble();
				if (acn.getAccountBalance() > amt) {
					double totalamt = acn.getAccountBalance() - amt;
					acn.setAccountBalance(totalamt);
					System.out.println("Withdrawal successful!\n Your Current Balance is: " + acn.getAccountBalance());
				} else {
					System.out.println("Insufficient Balance!\nYour Current Balance is: " + acn.getAccountBalance());
				}
			} /*
				 * else { System.out.println("Account not found!"); }
				 */

		}

	}

	@Override
	public void updateAccountDetails() {
		System.out.println("Enter your account number:");
		int accno = sc.nextInt();
		boolean flag = true;
		// Sbi sbi = new Sbi();
		/*
		 * if (ac.getAccountNo() == accno) {
		 * 
		 * while (flag) {
		 * System.out.println("*************************************************");
		 * System.out.println("Select one option:");
		 * System.out.println("1. Update Name");
		 * System.out.println("2. Update Contact");
		 * System.out.println("3. Update Email"); System.out.println("4. Exit");
		 * System.out.println("*************************************************"); int
		 * ch = sc.nextInt(); switch (ch) { case 1: //
		 * System.out.println("Enter Name:");
		 * this.ac.setAccountName(Validations.validateAccountHolderName());
		 * System.out.println("Name updated sucessfully!"); break; case 2: //
		 * System.out.println("Enter Contact:");
		 * ac.setContactNo(Validations.validatePhoneNo());
		 * 
		 * System.out.println("Contact updated sucessfully!"); break; case 3: //
		 * System.out.println("Enter Email:"); ac.setMail(Validations.validateEmail());
		 * System.out.println("Email updated sucessfully!"); break; case 4: flag =
		 * false; break; default:
		 * System.out.println("Invalid Option! Select appropriate option:"); } } } else
		 * { System.out.println("Invalid account number!"); }
		 */
		for (Account acn : a) {
			if ((acn != null) && (acn.getAccountNo() == accno)) {

				while (flag) {
					System.out.println("*************************************************");
					System.out.println("Select one option:");
					System.out.println("1. Update Name");
					System.out.println("2. Update Contact");
					System.out.println("3. Update Email");
					System.out.println("4. Exit");
					System.out.println("*************************************************");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						// System.out.println("Enter Name:");
						acn.setAccountName(Validations.validateAccountHolderName());
						System.out.println("Name updated sucessfully!");
						break;
					case 2:
						// System.out.println("Enter Contact:");
						acn.setContactNo(Validations.validatePhoneNo());

						System.out.println("Contact updated sucessfully!");
						break;
					case 3:
						// System.out.println("Enter Email:");
						acn.setMail(Validations.validateEmail());
						System.out.println("Email updated sucessfully!");
						break;
					case 4:
						flag = false;
						break;
					default:
						System.out.println("Invalid Option! Select appropriate option:");
					}
				}
			} /*
				 * else { System.out.println("Invalid account number!"); }
				 */

		}

	}

	@Override
	public void displaySingleAccount() {
		System.out.println("Enter Account Number: ");
		int an = sc.nextInt();
		for (Account acn : a) {
			if (acn != null && acn.getAccountNo() == an) {
				System.out.println(acn);
			}

		}

	}

	/*
	 * public void updateName() { System.out.println("Enter Name:");
	 * this.ac.setAccountName(sc.next());
	 * System.out.println("Name updated sucessfully!"); }
	 */

	/*
	 * public void updateContact() { System.out.println("Enter Contact:");
	 * ac.setContactNo(sc.nextLong());
	 * 
	 * System.out.println("Contact updated sucessfully!"); }
	 */

	/*
	 * public void updateEmail() {
	 * 
	 * System.out.println("Enter Email:"); ac.setMail(sc.next());
	 * System.out.println("Email updated sucessfully!");
	 * 
	 * }
	 */

}
