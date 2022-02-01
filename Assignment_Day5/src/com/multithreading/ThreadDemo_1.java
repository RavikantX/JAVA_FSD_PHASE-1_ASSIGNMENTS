package com.multithreading;

public class ThreadDemo_1 extends Thread{
	{
		System.out.println("Thread started");
		
	   //if we want to get the name of thread started then we will write as
		//System.out.println(Thread.currentThread().getName()+"started");
		}
	public static void main(String[] args) {
		ThreadDemo_1 t1=new ThreadDemo_1();
		ThreadDemo_1 t2=new ThreadDemo_1();
		
		t1.start();
		t2.start();

		
	}
	

}
