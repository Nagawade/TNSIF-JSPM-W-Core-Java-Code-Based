package com.multithreading.daytwelve;

public class Main {
	
	public static void main(String[] args) {
		
		ChildThread t1 = new ChildThread(10,"Hello Mauli");
		ChildThread t2 = new ChildThread(5,"SitaRaam");
		
		t1.start();
		t2.start();
		
		t2.setName("Mauli");
		
		try {
			
			t1.join();
			
			t2.join();
			
		}
		catch(InterruptedException e) {
			System.err.print(e.getMessage());
		}
		
		System.out.println("Terminate program");
	}
	
	

}
