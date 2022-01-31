package com.regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcherUsingRegex_demo3 {

	public static void main(String[] args) {
    
		String regex="[A-Za-z]+";
		String input="Hello Ravikant ";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		while(match.find())
		{
			System.out.println(input.substring(match.start(),match.end()));

	}

}
}
