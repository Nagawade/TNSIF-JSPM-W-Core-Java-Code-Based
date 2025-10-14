package com.threadlifecycle;

public  class Thread_Implementation implements Runnable {
	
	int begin,end;
	String msg;
	Thread t;
	
	
	public Thread_Implementation(int begin, int end, String msg) {
		super();
		this.begin = begin;
		this.end = end;
		this.msg = msg;
		
		
		t=new Thread(this, "Child Thread");
		t.start();	
	}


	@Override
	public void run() {
		
		for(int i =0 ; i<end ;i++) {
			try {
			Thread.sleep(500);
			
			}
			catch(InterruptedException e) {
				System.out.println("Error :"+e.getMessage());
			}
			
			System.out.println(i +" "+ msg);
			
			
		}
	}
	
	
	
	
	
	

}
