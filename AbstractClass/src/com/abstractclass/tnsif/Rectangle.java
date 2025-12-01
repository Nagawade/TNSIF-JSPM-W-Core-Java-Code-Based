package com.abstractclass.tnsif;

public class Rectangle extends Shape {
	
	float width;
	float height;
	
	

	public Rectangle() {
		
		width = 2.4f;
		height = 7.2f;
	}



	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}







	@Override
	public void calArea() {
		this.area = width * height;
		
		
	}

}
