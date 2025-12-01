package com.oop.polymorphysm.tnsif;

public class Overloadingdemo {
	public static void main(String[] args) {
		
		System.out.println("---------Constructor overloading--------");
		
		ConstructorOverloading ml = new ConstructorOverloading();
		System.out.println(ml);
		
		
		System.out.println("------------Method Overloading---------");
		
		System.out.println("Addition of two int :" + MethodOverloading.Addition(1,2));
		
		System.out.println("Addition of three int :" + MethodOverloading.Addition(1,2,7));

	}
}
