package com.multithreading;

// here we will see the demo by implementing RUNNABLE INTERFACE
public class ThreadDemo_3 implements Runnable {
	
	//Implement Run method
	public void run()
	{
		for (int i=1 ; i<=8 ; i++)
		{
			System.out.println(i);
			
			//using try catch method
			try {
				//making thread sleep for 1 sec
			Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
     
	public static void main(String[] args) {
		//Let create 2 target runnable interface
		ThreadDemo_3 ins1=new ThreadDemo_3();
		ThreadDemo_3 ins2=new ThreadDemo_3();
		
		//Now create 2 threads by passing 2 runnable targets constructor
		Thread t1 =new Thread(ins1);
		Thread t2 =new Thread(ins2);
		
		//now lets set the name of thread
		t1.setName("first");
	   t2.setName("second");
	   
	   t1.start();
	   t2.start();
	   
		
	}
}
