package com.vemcodex.code.encapsulation.pass;

public class BankAccount {
	private long accountNumber;
	private String ownerName;
	private double balance;
	
	public BankAccount(long accountNumber, String ownerName, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if(balance < amount) {
			throw new IllegalArgumentException("Cannot withdraw " + amount + " due to insufficient funds.");
		}
		
		balance -= amount;
	}
}
