package com.Exponent.BankApplication.Controller;

import java.util.Scanner;

import com.Exponent.BankApplication.Service.Rbi;
import com.Exponent.BankApplication.ServiceImpl.Sbi;

public class AdminController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rbi rbi=new Sbi();
		System.out.println("*******Welcome To SBI*******");
		
		boolean flag=true;
		while(flag) {
			System.out.println("*************************************************");
			System.out.println("1: Create Account \t \t \t \t|");
			System.out.println("2: Display all account details \t \t \t|");
			System.out.println("3: Display Balance \t \t \t \t|");
			System.out.println("4: Deposit Money \t \t \t \t|");
			System.out.println("5: Withdraw Money \t \t \t \t|");
			System.out.println("6: Update Account Details \t \t \t|");
			System.out.println("7. Display single account \t \t \t|");
			System.out.println("8: Exit");
			System.out.println("*************************************************");
			//System.out.println("Enter your choice between 1 to 8");
			int ch=validateCh();
			switch(ch) {
			case 1:
				rbi.createAccount();
				break;
			case 2:
				rbi.showAccountDetails();
				break;
			case 3:
				rbi.displayAccountBalance();
				break;
			case 4:
				rbi.depositMoney();
				break;
			case 5:
				rbi.withdrawMoney();
				break;
			case 6:
				rbi.updateAccountDetails();
				break;
			case 7:
				rbi.displaySingleAccount();
				break;
			case 8:
				flag=false;
				break;
			default:
				System.out.println("Invalid choice\n Enter a valid option:");
			}
		}
		sc.close();
		
	}
	public static int validateCh() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice:");
		int ch;
		try {
			ch=sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Invalid Choice ");
			return validateCh();
		}
		return ch;
	}
}
