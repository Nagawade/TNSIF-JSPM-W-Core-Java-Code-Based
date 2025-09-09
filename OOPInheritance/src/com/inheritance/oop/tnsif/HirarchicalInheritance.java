package com.inheritance.oop.tnsif;



public class HirarchicalInheritance {

	public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(p1);
		

		
		Person p;
		p=new Person("Mauli","Pune");
		System.out.println(p);
		
		p=new Employee("Rohit", "Tembhurni", 10, 23456, "JAVA DEVELOPER");
		System.out.println(p);
		
		p=new Student("Aditya", "Mumbai", "TY", 12345f);
		System.out.println(p);
				
		

	}

}
