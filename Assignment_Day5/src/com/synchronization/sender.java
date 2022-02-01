package com.synchronization;

public class sender {
	void send(String msg)
	{
		System.out.println(" Sending message "+msg);
		try {
			//here we will make thread sleep for 1 second
			Thread.sleep(1000);
		}catch (Exception e) {
			System.out.println(" Error while sending a message");
		}
		System.out.println("Message sent successfully");
		
		
	}

}
