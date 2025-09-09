package com.inheritance.oop.tnsif;

public class MultilevelInheritance {
	public static void main(String[] args) {
		City c = new City();
		
		
		c.setStatename("Maharashtra");
		c.setLanguage("Marathi");
		c.setCapital("Mumbai");
		c.setCityName("Pune");
		c.setArea(1);
		c.setCountryname("India");
		
		System.out.println(c);
	}
}
