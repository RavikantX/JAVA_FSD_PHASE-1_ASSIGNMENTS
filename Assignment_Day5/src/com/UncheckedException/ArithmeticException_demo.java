package com.UncheckedException;

import java.util.Scanner;

public class ArithmeticException_demo {

	public static void main(String[] args) {
		//Run time exception: Arithmetic exception
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		
		int div=num1/num2 ;
		System.out.println("Division is"+div);
		
		System.out.println("End of the Program");
		
   // if we provide any number as 0 in output section then we will get Arithmetic exception msg
	}

}
