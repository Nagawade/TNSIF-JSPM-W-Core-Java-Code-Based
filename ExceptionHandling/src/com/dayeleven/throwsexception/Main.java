package com.dayeleven.throwsexception;
import java.util.Scanner;


public class Main {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			int precentage = ThrowsKeyword.AcceptNumber();
		}
		catch(InvalidNumberException e) {
			System.out.println("Error message:"+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error message"+e.getMessage());
		}
		
		System.out.println("Program continues");
		
		
		
		
	}
}
