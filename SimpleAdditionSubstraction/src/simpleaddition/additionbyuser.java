package simpleaddition;

import java.util.Scanner;

public class additionbyuser {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int num1 , num2 ;
    System.out.println("Enter the first Number");
    num1=scanner.nextInt();
    System.out.println("Enter the second Number");
    num2=scanner.nextInt();
    int result = num1+num2 ;
    
    System.out.println("Result is "+result);
    
	}

}
