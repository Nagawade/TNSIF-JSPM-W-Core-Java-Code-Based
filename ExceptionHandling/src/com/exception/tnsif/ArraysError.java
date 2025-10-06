package com.exception.tnsif;

public class ArraysError {
	
	public static void ArrayEXception(){
	
	try {
		
		int arr [] = {1,2,3,4,5};
		
		int element = arr[7];
		
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("Cought error"+e.getMessage());
	}
	
	}

}
