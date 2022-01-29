package conditionTestForVoting;

import java.util.Scanner;

public class ifelseConditioncheck {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	
	int age= sc. nextInt();
	
	if (age>=18)
	{
		System.out.println("Valid for vote");
	}
	else
		
	{
		System.out.println("Not valid for vote");
		
	}
	
	

	}

}
