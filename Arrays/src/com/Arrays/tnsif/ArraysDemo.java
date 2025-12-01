package com.Arrays.tnsif;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		OneDimensionalArray arr [];
		
		arr = new OneDimensionalArray[3];
		arr[0] = new OneDimensionalArray(1,"Mauli");
		arr[1] = new OneDimensionalArray(2,"Rohit");
		arr[2] = new OneDimensionalArray(3,"Tanmay");
		
		for (int i = 0;i<(arr.length);i++) {
			
			System.out.println("Roll no :"+arr[i].getRollNo()+" Name :"+arr[i].getName());
		}
	
		
	}

}
