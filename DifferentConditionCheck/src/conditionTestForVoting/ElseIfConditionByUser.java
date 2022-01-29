package conditionTestForVoting;

import java.util.Scanner;

public class ElseIfConditionByUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage");
		
            int per=sc.nextInt();
            
		
		if(per>60 && per<=100)
		System.out.println("First class");
		else if(per>45 && per<=60)
			System.out.println("Second class");
		else
			System.out.println("Enter correct Percentage");
		

	}

}
