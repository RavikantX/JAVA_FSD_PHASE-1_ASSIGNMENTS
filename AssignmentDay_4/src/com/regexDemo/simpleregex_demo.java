package com.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class simpleregex_demo {
public static void main(String[] args) {
		
		String regex="[a-z]+";
		String input="tat";
		
		//we can use different pattern for validation
		
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
