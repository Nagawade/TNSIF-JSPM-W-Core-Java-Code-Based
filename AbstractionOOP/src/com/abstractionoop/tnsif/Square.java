package com.abstractionoop.tnsif;

public class Square extends Shape {
	
	private float side ;
	
	public Square() {
		
		side = (float) 1.0;
	}

	public Square(float side) {
		super();
		this.side = side;
	}
	
	

	

	

	@Override
	public void calarea() {
		this.area = side * side;
		
	}
	

}
