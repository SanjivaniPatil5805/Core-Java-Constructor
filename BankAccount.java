package com.practice.constructor;

// Question. Create a BankAccount class with accountNumber and balance. Initialize and display the account details.

public class BankAccount {
	
	String accountNumber;
	double balance;
	
	public BankAccount() {
		
		this.accountNumber = "MH13663889290";
		this.balance = 450050;

		
	}
	
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		
		System.out.println("Account Number = "+b.accountNumber);
		System.out.println("Balance = "+b.balance);
		
	}

}
