package com.dayeleven.throwsexception;
import java.util.Scanner;


public class ThrowsKeyword {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int AcceptNumber() throws InvalidNumberException {
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num<0) {
			throw new InvalidNumberException("Negative numbers are not accepted");
		}
		
		if(num >100 ) {
			
			throw new InvalidNumberException("Percentage can't be more than 100");
		}
		
		return num;
	}
	
}
