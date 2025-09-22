package com.inertfaceopp.tnsif;

public class BankDemo {
	
	public static void main(String[] args) {
		
		SavingAccount s1 = new SavingAccount("Mauli","Pune",1234,20000);
		
		s1.deposit(5000);
		s1.withdraw(2000);
		
		s1.deposit(20000);
		
	}

}
