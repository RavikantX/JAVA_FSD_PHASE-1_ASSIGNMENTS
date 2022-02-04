package com.EmailValidationProject;

import java.util.Scanner;

public class EmailValidation {
	

	String email[] = {"ravikant97087@gmail.com","ravi9060@gmail.com","ravishera@gmail.com",
			"ravikant@yahoo.com","ravikant22@reddifmail.com","ravikantmanpur@amazon.com",
		    "ravikant@byjus.com", "ravikant@simplilearn.com",};
	
	static  boolean flag=false;
	public static void main(String[] args){
		
		if(flag){
			System.out.println("Please enter valid Email ID:");
			System.out.println("Enter Email ID again:");
			}
		
		else{
			System.out.println("Enter Email ID :");
			}
		
		Scanner sc = new Scanner(System.in);
		String b = sc.next();
		 EmailValidation emailid = new  EmailValidation();
		boolean result = emailid.checkEmailID(b);
		
		if (result)
			System.out.println("User Validated -- Signned In");
		
		else {
			flag=true;
			main(new String[] { "" });
			}
		}
	
	public boolean checkEmailID(String MailID){
		for(int i=0; i<email.length; i++){
			String k=email[i];
			if(MailID.equals(k)){
				return true;
				}
			}
		return false;

}
}
