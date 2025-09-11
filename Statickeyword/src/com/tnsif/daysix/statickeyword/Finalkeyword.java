package com.tnsif.daysix.statickeyword;

public class Finalkeyword {
	
	final int x = 100;
	
	final static int y;
	
	final static int z = 10;
	
	void change() {
		
		//z = 100;
		
		//y =23;
	}

	@Override
	public String toString() {
		return "Finalkeyword [x=" + x + ",y=" + y + "]";
	}
	
	static {
		
		//z = 89 ;
		
		y = 20;
		
		System.out.println("Value of y :"+y);
	}
	
	
	
	
}
