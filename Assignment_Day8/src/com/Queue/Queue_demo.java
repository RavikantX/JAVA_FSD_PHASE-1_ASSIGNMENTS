package com.Queue;

import java.util.Queue;

public class Queue_demo {

	public static void main(String[] args) {
		Queue<String> locationsQueue = new java.util.LinkedList<>();
		
		locationsQueue.add("Bhubaneshwar");
		locationsQueue.add("Maharastra");
		locationsQueue.add("Delhi");
		locationsQueue.add("Patna");
		locationsQueue.add("Sonepur");
		
		//For accessing the queue
		System.out.println("Queue is : " + locationsQueue);
		
		// To find the Head of queue
		System.out.println("Head of Queue : " + locationsQueue.peek());
		
		// For removing the element
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		
		// For finding the size of queue
		System.out.println("Size of Queue : " + locationsQueue.size());
}
}
