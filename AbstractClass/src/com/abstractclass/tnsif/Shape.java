package com.abstractclass.tnsif;

public abstract class Shape {
	
	protected float area ;
	
	// abstract method
	public abstract void calArea();
	
	// solid
	
	public void show() {
		System.out.println("The area of the shape is : "+ area);
	}
}
