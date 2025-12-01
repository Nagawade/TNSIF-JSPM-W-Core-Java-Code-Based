package com.encapsulation.tnsif;

public class Encapsullation {
	public static void main(String args []) {
		OOPConcepts obj = new OOPConcepts();
		
		obj.setAge(21);
		obj.setName("Mauli Nagawade");
		obj.setSerialNum(06);
		
		System.out.println("Name:"+obj.getName());
		System.out.println("Age :"+obj.getAge());
		System.out.println("Roll number :"+obj.getSerialNum());
		
	}
}
