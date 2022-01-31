package com.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation_demo {
public static void main(String[] args) {
		
		String regex="[987]{3}[0-9]{7}";
		String input="9784527814"; //this will show valid as number starts with 9

		
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if(match.matches())
		{
			System.out.println("Pattern Matched");
		}
		else
		{
			System.out.println("invalid input");

}
}
}