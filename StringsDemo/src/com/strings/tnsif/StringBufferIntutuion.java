package com.strings.tnsif;

public class StringBufferIntutuion {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Good Morning , Have a great day ahed");
		System.out.println(buffer);
		
		StringBuffer buffer1 = new StringBuffer("Raam Krushna Hari");
		
		System.out.println("------------------------ Initial size of buffer is 16 bits ------------------");
		System.out.println("Capicity :"+buffer.capacity());
		System.out.println(buffer.compareTo(buffer1));
		
		System.out.println(buffer.hashCode());
		
		System.out.println(buffer1);
		
		System.out.println(buffer1.hashCode());
		
		
	}

}
