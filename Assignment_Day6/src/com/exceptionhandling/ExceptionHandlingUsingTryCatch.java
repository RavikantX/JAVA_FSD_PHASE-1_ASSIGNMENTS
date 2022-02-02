package com.exceptionhandling;

public class ExceptionHandlingUsingTryCatch {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			//Try is used to write the risky code where we think exception can occured
			try
			{
				//here we will write risky code
				sum=sum+ Integer.parseInt(args[i]);
				
				//Here we will use catch method to catch that exception which can occured
				
			}catch(Exception e)
			{
				System.out.println("Exception occured"+e);
				
			}
			System.out.println("Sum is "+sum);
			//if we run this program as Run as Configuration then after putting arguments we get
			//the output along with exception NumberFormatException//
		}

	}

}
