package com.oop.polymorphysm.tnsif;

public class ConstructorOverloading {
	
	private int x ;
	private int y ;
	
	public ConstructorOverloading(int x,int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public ConstructorOverloading() {
			
			this.x = 1;
			this.y = 2;
			
		}

	@Override
	public String toString() {
		return "ConstructorOverloading [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
