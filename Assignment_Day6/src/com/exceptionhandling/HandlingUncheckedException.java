package com.exceptionhandling;

public class HandlingUncheckedException {

	static void divide(int a, int b)
	{
	//Throwing unchecked exception
		
	int c=a/b;
	System.out.println("Result "+c);
}
     public static void main(String[] args) {
	try {
		divide(2,0);
	}
	catch(Exception e)
	{
		System.out.println("Error "+e);
		e.printStackTrace();
	}
	
}
}
