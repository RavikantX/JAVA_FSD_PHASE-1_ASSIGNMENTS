package com.synchronization;

public class user extends Thread{
	
	String name;
	String msg;
	sender sender;
	
	public user (String name , String msg , sender sender)
	{
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	public void run()
	{
		System.out.println(name +" wants to send a message"+msg);
		
		// here we will use synchoronized to access synchronization
		synchronized(sender)
		{
			sender.send(msg);
			
		}
		
	}
	

}
