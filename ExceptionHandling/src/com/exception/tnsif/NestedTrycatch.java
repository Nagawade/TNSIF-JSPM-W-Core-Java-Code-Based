package com.exception.tnsif;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NestedTrycatch {
	
	public static void division(int a,int b,int c) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			 a = sc.nextInt();
			 b = sc.nextInt();
			
			 c = a/b;
			 
			 System.out.println("Result"+c);
		}
		
		catch(ArithmeticException e) {
			System.err.println("Error :"+e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Error :"+e.getMessage());
			
		}
		
		catch(InputMismatchException e) {
			
			System.err.println(e.getMessage());
		}
		
		catch(Exception e) {
					
					System.err.println(e.getMessage());
				}
		
		finally {
			
			System.out.println("Finally block exeucuted");
		}
	}

}
