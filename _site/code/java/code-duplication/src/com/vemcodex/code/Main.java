package com.vemcodex.code;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		runDemo1();
		runDemo2();
		runDemo3();
		runDemo4();
	}
	
	private static void runDemo1() {
		System.out.println("Running Demo 1: Character-for-character Code Duplication");
		
		// Register initial set of bank accounts
		
		ArrayList<Double> accountBalances = new ArrayList<Double>();
		accountBalances.add(5000.00);
		accountBalances.add(4300.00);
		accountBalances.add(6900.00);
		
		// Display the balance for all accounts
		
		double total = 0;
		
		for(int i = 0; i < accountBalances.size(); i++) {
			double accountBalance = accountBalances.get(i);
			System.out.println("Balance for account " + i + " is: " + accountBalance);
			total += accountBalance;
		}
		
		System.out.println("Total balance for all accounts: " + total);
		
		// Then, some further accounts are registered
		
		accountBalances.add(7500.00);
		accountBalances.add(8900.00);
		
		// There could be transactions performed as well, and any other business logic
		
		// However, at the end of the day, we need to again display the account balances
		// so the simple "quick" solution is to copy-paste the code above and use it again below
		
		total = 0;
		
		for(int i = 0; i < accountBalances.size(); i++) {
			double accountBalance = accountBalances.get(i);
			System.out.println("Balance for account " + i + " is: " + accountBalance);
			total += accountBalance;
		}
		
		System.out.println("Total balance for all accounts: " + total);
	}
	
	private static void runDemo2() {
		System.out.println("Running Demo 2: Token-for-token Code Duplication");
		
		// Register initial set of bank accounts
		
		ArrayList<Double> accountBalances = new ArrayList<Double>();
		accountBalances.add(5000.00);
		accountBalances.add(4300.00);
		accountBalances.add(6900.00);
		
		// Display the balance for all accounts
		
		double totalMorning = 0;
		
		for(int i = 0; i < accountBalances.size(); i++) {
			double accountBalance = accountBalances.get(i);
			System.out.println("Morning balance for account " + i + " is: " + accountBalance);
			totalMorning += accountBalance;
		}
		
		System.out.println("Total morning balance for all accounts: " + totalMorning);
		
		// Then, some further accounts are registered
		
		accountBalances.add(7500.00);
		accountBalances.add(8900.00);
		
		// There could be transactions performed as well, and any other business logic
		
		// However, at the end of the day, we need to again display the account balances
		// so the simple "quick" solution is to copy-paste the code above and use it again below
		
		double totalAfternoon = 0;
		
		for(int i = 0; i < accountBalances.size(); i++) {
			double accountBalance = accountBalances.get(i);
			System.out.println("Afternoon balance for account " + i + " is: " + accountBalance);
			totalAfternoon += accountBalance;
		}
		
		System.out.println("Total afternoon balance for all accounts: " + totalAfternoon);
	}
	
	private static void runDemo3() {
		System.out.println("Running Demo 2: Functional Code Duplication");
		
		// Register initial set of bank accounts
		
		ArrayList<Double> accountBalances = new ArrayList<Double>();
		accountBalances.add(5000.00);
		accountBalances.add(4300.00);
		accountBalances.add(6900.00);
		
		// Display the balance for all accounts
		
		double total = 0;
		
		for(int i = 0; i < accountBalances.size(); i++) {
			double accountBalance = accountBalances.get(i);
			System.out.println("Balance for account " + i + " is: " + accountBalance);
			total += accountBalance;
		}
		
		System.out.println("Total balance for all accounts: " + total);
		
		// Then, some further accounts are registered
		
		accountBalances.add(7500.00);
		accountBalances.add(8900.00);
		
		// There could be transactions performed as well, and any other business logic
		
		// However, at the end of the day, we need to again display the account balances
		// so the simple "quick" solution is to copy-paste the code above and use it again below
		
		total = accountBalances.stream().mapToDouble(Double::doubleValue).sum();
		
		int i = 0;
		while(i < accountBalances.size()) {
			double accountBalance = accountBalances.get(i);
			System.out.println("Balance for account " + i + " is: " + accountBalance);
			i++;
		}
		
		System.out.println("Total balance for all accounts: " + total);
	}
	
	private static void runDemo4() {
		System.out.println("Running Demo 4: Mixed Code Duplication");
		
		// Register initial set of bank accounts
		
		ArrayList<Double> accountBalances = new ArrayList<Double>();
		accountBalances.add(5000.00);
		accountBalances.add(4300.00);
		accountBalances.add(6900.00);
		
		// Display the balance for all accounts
		
		double totalMorning = 0;
		
		for(int i = 0; i < accountBalances.size(); i++) {
			double accountBalance = accountBalances.get(i);
			System.out.println("Morning balance for account " + i + " is: " + accountBalance);
			totalMorning += accountBalance;
		}
		
		System.out.println("Total morning balance for all accounts: " + totalMorning);
		
		// Then, some further accounts are registered
		
		accountBalances.add(7500.00);
		accountBalances.add(8900.00);
		
		// There could be transactions performed as well, and any other business logic
		
		// However, at the end of the day, we need to again display the account balances
		// so the simple "quick" solution is to copy-paste the code above and use it again below
		
		double totalAfternoon = accountBalances.stream().mapToDouble(Double::doubleValue).sum();
		
		int i = 0;
		while(i < accountBalances.size()) {
			double accountBalance = accountBalances.get(i);
			System.out.println("Afternoon balance for account " + i + " is: " + accountBalance);
			i++;
		}
		
		System.out.println("Total afternoon balance for all accounts: " + totalAfternoon);
	}

}
