package com.abstractionoop.tnsif;

public class Rectangle extends Shape  {
	
	private float length;
	private float breadth;
	
	

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle() {
		
		length = 2.0f;
		breadth = 4.2f;
	}



	@Override
	public void calarea() {
		
		area = length * breadth ;
		
	}
	
	

}
