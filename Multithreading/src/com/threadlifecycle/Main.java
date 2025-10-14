package com.threadlifecycle;

public class Main {
	
	public static void main(String[] args) {
		Thread mythread = new ThreadLifeCycleDemo();
		
		System.out.println("Before run :"+mythread.isAlive());
		
		mythread.start()
;		
		try {
			
			Thread.sleep(450);
			
			System.out.println("In runnable state :"+mythread.isAlive());
			
			
			
			
		}
		
		catch(InterruptedException e) {
			
			System.err.println(e.getMessage());
		}
		
		System.out.println("After the completion is my thread alive:"+mythread.isAlive());
		
	}
}
