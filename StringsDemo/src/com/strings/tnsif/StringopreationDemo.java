package com.strings.tnsif;

public class StringopreationDemo {
	
	public static void main(String[] args) {
		
		String s1 = new String(" Mauli ");
		
		String s2 = new String("Nagawade");
		
		
		System.out.println(s2);
		System.out.println(s1);
		
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		System.out.println(s3.toUpperCase());
		
		System.out.println("Length of total string :"+s3.length());
		
		System.out.println(s1.trim()); // removes whitespaces front and back
		
		System.out.println(s1.stripTrailing()); // removes last spaces
		
		System.out.println(s1.equals(s2));  // matches characters
		
		System.out.println(s1==s2); // checks memory
		
	}

}
