package com.exceptionhandling;

public class OwnExceptionUsingThrows {

	//We can throw exception by Own for that we use keyword throws
	static void check(int age) throws Exception
	{
		if (age<18)
			throw new Exception("Not valid age Exception");
		else
			System.out.println("Valid user");
	}
	public static void main(String[] args) {
		//lets try for age 19 then it will show valid result 
		try {
		//check(19);
			//for age of 16 it shows OwnExceptionUsingThrows
			check(16);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
