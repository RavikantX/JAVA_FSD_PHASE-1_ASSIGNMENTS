package com.UncheckedException;

import java.util.Scanner;

public class NullPointerException_demo {

	public static void main(String[] args) {
	
		String name=null;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter email ");
		String email=sc.next();
		
		//using if and else method
		
		if (name.equals(email))
			System.out.println("Use Authenticated");
		
		else
			System.out.println(" Not a Valid User");
		// here in output if we write our email it shows NullPointerException
		

	}

}
