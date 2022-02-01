package com.multithreading;

public class SleepWaitDemo {
	private static Object LOCK =new Object();
	  public static void main(String[] args) {
		  
		  try {
			  
			  // HERE WE WILL PUT MAIN THREAD FOR SLEEP OF 1 SECOND
			  Thread.sleep(1000);
			  System.out.println(Thread.currentThread().getName()+" is woke up after "+ "1 second of sleep");
			  
			  // here we will use synchronized lock
			  synchronized (LOCK) {
				  // here we will put a thread on a wait for 2 second
				  LOCK.wait(2000);
				  System.out.println("Object is woke up after wait of 2 seconds ");
			  }
		  }catch (InterruptedException e) {
			  System.out.println(" Error occured"+e);
				  
			  }
			  	
		
		  }
	  }
	


