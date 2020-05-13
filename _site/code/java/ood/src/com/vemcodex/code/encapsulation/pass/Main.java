package com.vemcodex.code.encapsulation.pass;

public class Main {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(9243242342335L, "John Smith", 4000);
		bankAccount.deposit(5000);
		bankAccount.withdraw(2000);
	}
}
