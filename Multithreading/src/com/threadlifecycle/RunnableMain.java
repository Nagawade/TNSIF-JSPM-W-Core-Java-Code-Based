package com.threadlifecycle;

public class RunnableMain {

		public static void main(String[] args) {
			Runnable r = new Thread_Implementation(1,10,"Successfull");
			
			Thread t1 = new Thread(r);
			
			t1.start();
		}
}
