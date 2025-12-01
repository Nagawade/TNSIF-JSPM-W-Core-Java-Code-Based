package com.inertfaceopp.tnsif;

public interface NestedInterface {
	
	void calArea();
	
	interface Innerinterface{
		
		int id = 20;
		
		void print();
	}

}
