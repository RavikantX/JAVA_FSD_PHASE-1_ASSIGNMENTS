package com.divisibleby5;

import java.util.Scanner;

public class checkdivisibleby_5 {

	public static void main(String[] args) {
	int n ;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any number");
	
	n =s.nextInt();
	if ( n % 5 == 0)
	{
		System.out.println("number is divisible by 5");
		
	}
	else
	{
		System.out.println("number is not divisible by 5");

	}

	}
}
