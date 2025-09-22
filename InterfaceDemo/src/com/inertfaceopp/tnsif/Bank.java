package com.inertfaceopp.tnsif;

public interface Bank {

	float minBal = 5000;
	float deposite_limit = 50000;
	
	public void deposit(float amount);
	
	public void withdraw(float amount);
}
