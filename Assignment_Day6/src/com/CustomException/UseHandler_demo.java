package com.CustomException;



public class UseHandler_demo {
	static void check(int age) throws AgeNotValidException
	{
		if(age<18)
			throw new AgeNotValidException("User can not vote before 18");
		else
			System.out.println("can Vote");
	}
	
	public static void main(String[] args) {
		
		try {
			//if we put age as 18 then it will show console as "can vote"
			//check(18);
			
			/*if we put age as 15 then display a message as "User can not vote before 18"
			 * with "AgeNotValidException" 
			 */
			check(15);
		} catch (AgeNotValidException e) {
			
			System.out.println(e);
		}
	}
}

	
