package com.exception.tnsif;

public class ExceptionHandlingfirst {
	
	public static void performDivision(int x,int y) {
		
		try {
			
			System.out.println("I am in division method");
			
			float z = x/y;
		}
		catch(ArithmeticException e) {
			
			System.out.println("I am in catch block");
			System.err.println(e.getMessage());
		}
		
		
		//System.out.println("Result z :"+z);
	}
	


}
