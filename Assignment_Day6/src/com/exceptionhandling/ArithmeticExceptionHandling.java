package com.exceptionhandling;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
	 // Here we will look after how to handle Arithmetic Exception
		
	int a=50;
	int b=0;
			try
	{
				int c=a/b;
				System.out.println("Result is "+c);
				
	}
	catch(ArithmeticException e)
	{
		System.out.println("Error "+e);
		//if we run this program we get ArithmeticException
	}
			

	}

}
