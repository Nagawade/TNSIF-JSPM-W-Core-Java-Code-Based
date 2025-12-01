package com.threadlifecycle;

public class ThreadLifeCycleDemo extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("Checking....."+this.isAlive());
		
		
		
		int num = 0;
		
		while(num <5) {
			
			System.out.println("Number :"+num);
			
			num++;
			
		}
		
		try {
			
			sleep(500);
			
			this.isAlive();
			
			System.out.println("The thread in runnable");
		}
		
		catch(InterruptedException e) {
			
			System.err.println("Thread Interrupted :"+e.getMessage());
		}
		
		System.out.println("After exeucution is thread alive :"+this.isAlive());
		
	}
	
}
