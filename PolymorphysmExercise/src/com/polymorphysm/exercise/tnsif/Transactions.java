package com.polymorphysm.exercise.tnsif;

public class Transactions {
	
	private int IFSC;
	private long acc_no;
	private int amount;
	private long phone_no;
	private int pin;
	
	
	
	public static void Transaction(String IFSC, long acc_no,int amount) {
		
		
		
		// Bank to bank transaction
		System.out.println("Bank to Bank");
		System.out.println("The deposited amount is :"+amount);
		
	}
	
	public static void Transaction(long phone_no , int amount) {
		System.out.println("Phone Pay");
		System.out.println("The amount sent to no is :"+amount);
	}
	
	public static void Transaction(int pin,int amount) {
		
		System.out.println("ATM Transaction");
		System.out.println("The amount sent to no is :"+amount);
		
	}
	
	
}
