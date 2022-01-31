package com.arithmeticcalculator;

import java.util.Scanner;
	
	class s1
	{
		int result;
		//For addition of two number we will use
		public void add(int a,int b)
		{
			result=a+b;
			System.out.println("Addition of two Number"+result);
		}
		//for Subtraction of two number we will use
		public void sub(int a,int b)
		{
			result=a-b;
			System.out.println("Subtraction of two Number"+result);
		}
		//For multiplication of two number we will use
		public void multi(int a,int b)
		{
			result=a*b;
			System.out.println("Multiplication of two Number"+result);
		}
		//For division of two number we will use
		public void divide(int a,int b)
		{
			result=a/b;
			System.out.println("Division of two Number"+result);
		}
	}

	public class arithmeticCalculator {
		public static void main(String[] args) {
			s1 obj=new s1();
			
			// Here we will use scanner so that user can give the two number of its own choice
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter 1st Number:");
			int n=sc.nextInt();
			System.out.println("Enter 2nd Number:");
			int m=sc.nextInt();
			
			obj.add(n,m);
			obj.sub(n,m);
			obj.multi(n,m);
			obj.divide(n,m);
			
		}

	}

