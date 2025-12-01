package com.abstractionoop.tnsif;

public abstract class Shape {
	
	protected float area;
	
	public  abstract void calarea();
	
	public void show() {
		
		System.out.println("The area of the shape is :"+area);
	}
	

}
