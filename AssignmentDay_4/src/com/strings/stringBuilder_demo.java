package com.strings;

public class stringBuilder_demo {

	public static void main(String[] args) {
		// we will use the same code as both are same only we will change the syntax for stringBuilder
		String str= new String("Hello World");
		//convert string to stringBuilder
		StringBuilder s1=new StringBuilder(str);
		
		//for length calculation
		System.out.println("size "+s1.length());
		
		//For adding a letter 
		s1.append(" Welcome");
		System.out.println(s1);
		
		//for inserting a letter
		s1.insert(5, " ");
		System.out.println(s1);
		
		//for replacing a word between given letter
		s1.replace(12, 19, "Bye ");
		System.out.println(s1);
		
		//for reversing the letter
		s1.reverse();
		System.out.println(s1);


	}

}
