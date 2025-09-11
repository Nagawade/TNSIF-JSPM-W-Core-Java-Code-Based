package com.tnsif.daysix.statickeyword;

public class FinalMathodClassTest extends FinalClass {
	
	
	@Override void show() {
		
		// can't override final method
	}
}


final class FinalClass{
	
	void show() {
		
		System.out.println("Final class can't be extended");
	}
	
}




