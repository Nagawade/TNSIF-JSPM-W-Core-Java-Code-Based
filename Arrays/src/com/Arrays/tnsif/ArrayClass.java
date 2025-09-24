package com.Arrays.tnsif;

import java.util.Arrays;

public class ArrayClass {
	
	public static void main(String[] args) {
		
		int intArray [] = {7,9,5,8,10};
		
		System.out.println("--------------------------Array Class from utility package-------------------------");
		
		System.out.println("Size of array is :"+intArray.length);
		
		
		System.out.println(Arrays.toString(intArray));
		
		for(int i = 0 ; i<intArray.length;i++) {
			
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
		
		
		Arrays.sort(intArray);
		System.out.println(Arrays.toString(intArray));
		
		
		
	}

}
