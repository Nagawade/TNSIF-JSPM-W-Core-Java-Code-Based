package com.abstractclass.tnsif;

public class AbstractionDemo {
	
	public static void main(String[] args) {
		
		Shape s;
		s = new Square(0.5f);
		s.calArea();
		s.show();
		
		s = new Rectangle(5,4);
		s.calArea();
		s.show();
	}
}
