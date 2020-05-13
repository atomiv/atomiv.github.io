package com.vemcodex.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	
	private static void runDemo1a() {
		double accountBalance = 3000;
		double withdrawal = 50;
		
		if(withdrawal <= accountBalance) {
			accountBalance -= withdrawal;
			System.out.println("Successful withdrawal, updated balance: " + accountBalance);
		} else {
			System.out.println("Failed withdrawal");
		}
		
		double accountBalance2 = 6000;
		double withdrawal2 = 7000;
		
		if(withdrawal2 <= accountBalance2) {
			accountBalance2 -= withdrawal2;
			System.out.println("Successful withdrawal, updated balance: " + accountBalance2);
		} else {
			System.out.println("Failed withdrawal");
		}
	}
	
	private static void runDemo12() {
		double accountBalance = 3000;
		double withdrawal = 50;
		
		withdraw(accountBalance, withdrawal);
		
		double accountBalance2 = 6000;
		double withdrawal2 = 7000;
		
		withdraw(accountBalance2, withdrawal2);
		
	}
	
	private static void withdraw(double accountBalance, double withdrawal) {
		if(withdrawal <= accountBalance) {
			accountBalance -= withdrawal;
			System.out.println("Successful withdrawal, updated balance: " + accountBalance);
		} else {
			System.out.println("Failed withdrawal");
		}
	}
	
	private static void runDemo2() {
		List<String> stringList = Arrays.asList("Apple", "Banana", "Orange");
		
		for(String stringElement : stringList) {
			System.out.println(stringElement);
		}
		
		int stringListSize = stringList.size();
		System.out.println(stringListSize);
		
		List<Integer> intList = Arrays.asList(60, 23, 80, 90);
		
		for(int intElement : intList) {
			System.out.println(intElement);
		}
		
		int intListSize = intList.size();
		System.out.println(intListSize);
	}
	
	private static void runDemo22() {
		List<String> stringList = Arrays.asList("Apple", "Banana", "Orange");
		showInfo(stringList);
		
		List<Integer> intList = Arrays.asList(60, 23, 80, 90);
		showInfo(intList);	
	}
	
	private static <T> void showInfo(List<T> list) {
		for(T element : list) {
			System.out.println(element);
		}
		
		int listSize = list.size();
		System.out.println(listSize);
	}
	
	private static void runDemo3a() {
		int left = 5;
		int right = 7;
		
		System.out.println("Left: " + left);
		System.out.println("Right: " + right);
		
		int result = left + right;
		
		System.out.println("Result: " + result);

		int left2 = 5;
		int right2 = 7;
		
		System.out.println("Left: " + left2);
		System.out.println("Right: " + right2);
		
		int result2 = left2 * right2;
		
		System.out.println("Result: " + result2);
	}
	
	private static void runDemo32() {
		int left = 5;
		int right = 7;
		
		runBinary((l, r) -> l + r, left, right);
		
		int left2 = 5;
		int right2 = 7;
		
		runBinary((l, r) -> l * r, left2, right2);
	}
	
	private static void runBinary(BiFunction<Integer, Integer, Integer> binaryFunction, int left, int right) {
		System.out.println("Left: " + left);
		System.out.println("Right: " + right);
		
		int result = left + right;
		
		System.out.println("Result: " + result);		
	}

}
