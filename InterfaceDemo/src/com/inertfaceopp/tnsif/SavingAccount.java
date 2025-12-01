package com.inertfaceopp.tnsif;

public class SavingAccount extends Customer implements Bank {
	
	private int accNo;
	
	private float ball;
	
	
	
	
	


	
	public SavingAccount(String name, String city, int accNo, float ball) {
			super(name, city);
			this.accNo = accNo;
			this.ball = ball;
		}





	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public float getBall() {
		return ball;
	}


	public void setBall(float ball) {
		this.ball = ball;
	}


	@Override
	public void deposit(float amount) {
		
		if(amount < 0 || amount>deposite_limit) {
			
			System.out.println("Invalid amount please enter the valid amount");
		}
		
		else {
			
			ball=ball+amount;
		}
		
		
	}


	@Override
	public void withdraw(float amount) {
		
		if(amount < ball-minBal) {
			
			ball -= amount;
			System.out.println("Withdrawed amount :"+amount);
			System.out.println("Total Amount :"+amount);
		}
		
	}


	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", ball=" + ball + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	
	
	
	
	
	

}
