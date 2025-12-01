package com.strings.tnsif;

public class StringComparison {
	 
	public static void main(String[] args) {
		
		String s1 = "TNSIF";
		String s2 ="TNSIF";
		
		String s3 = new String("TNSIF");
		String s4 = new String("TNSIF");
		
		
		//== --> Object Memory
		
		// equals() --> Matches characters 
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		
		System.out.println(s1==s3);
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s4));


				
				
		
	}
}
