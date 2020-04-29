package com.vemcodex.code.encapsulation.fail;

public class Main {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		
		bankAccount.accountNumber = 9243242342335L;
		bankAccount.ownerName = "John Smith";
		bankAccount.balance = 4000; // Initial balance
		bankAccount.balance = 9000; // Updated balance after deposit
		bankAccount.balance = 7000; // Updated balance after withdrawal
	}

}
