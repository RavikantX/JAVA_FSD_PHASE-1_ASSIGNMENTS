package com.UncheckedException;

import java.util.Scanner;

public class NumberFormatException_demo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any number");
		String num1=sc.next();
		
		
	//Lets convert string to number
		int number=Integer.parseInt(num1);
		
		System.out.println(" Number is "+number);
		
		System.out.println(" End of the program");
		
      //here if we put any integer in output then it will not show error but when we put 
		// any integer value along with string value it will show NumberFormatException
	}

}
