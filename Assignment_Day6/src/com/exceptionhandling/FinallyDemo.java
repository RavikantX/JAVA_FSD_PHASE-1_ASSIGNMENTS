package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter any value");
		 
		try {
			int num=sc.nextInt();
			System.out.println(" value"+num);
		}
		catch(InputMismatchException e)
		{
			System.out.println(" Wrong Input"+e);
			
		}
		finally
		

		{
			sc.close();
			System.out.println(" Scanner closed successfully");
			/*here if write any ineteger value then it will show value and if we give integer 
			 * along with string value then then will show InputMismatchException
			 */
		}
	}

}
