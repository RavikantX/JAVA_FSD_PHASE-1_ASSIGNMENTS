package com.multithreading;

public class ThreadDemo_2 extends Thread {
	public void run()
	{
		for (int i=1 ; i<=8 ; i++)
		{
			System.out.println(i);
			
			//using try catch method
			try {
			Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e);
			
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo_2 t1=new ThreadDemo_2();
		ThreadDemo_2 t2=new ThreadDemo_2();
		
		t1.start();
		t2.start();
		
		
	}
}
