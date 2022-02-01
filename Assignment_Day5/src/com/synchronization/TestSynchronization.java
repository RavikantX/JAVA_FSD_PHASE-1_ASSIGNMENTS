package com.synchronization;

public class TestSynchronization {

	public static void main(String[] args) {
	
		sender sender=new sender();
		user t1=new user(" Rupa", "Hello good morning..!", sender);
		user t2=new user(" Ravikant", "Hello a good morning to all..!", sender);
		
		t1.start();
		t2.start();
		
		
		
		

	}

}
