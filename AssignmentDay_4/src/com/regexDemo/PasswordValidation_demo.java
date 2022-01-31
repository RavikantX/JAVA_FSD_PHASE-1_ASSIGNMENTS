package com.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation_demo {

	public static void main(String[] args) {
		String regex="^(?=.*[A-Z]).{8,}";
		//provide password input having one upper case letter 
		String input="1dgj5Aa678"; //similarly we can use different condition check
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if(match.matches())
		{
			System.out.println("Passowrd valid");
		}
		else
		{
			System.out.println("Not valid");
	}

}
}
