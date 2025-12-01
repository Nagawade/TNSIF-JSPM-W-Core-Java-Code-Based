package com.abstractionoop.tnsif;

public class Abstraction {
	
	public static void main(String[] args) {
		
		Shape s;
		
		s = new Square();
		s.calarea();
		
		s = new Rectangle();
		s.calarea();
	}

}
