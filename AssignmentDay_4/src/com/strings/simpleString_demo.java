package com.strings;

public class simpleString_demo {

	public static void main(String[] args) {
	
		String s1=new String("Hello Ravikant");
		// Let check for character at 1st position
		
		char c= s1.charAt(1);
        System.out.println("Character at index 1 "+c);
        // Now lets check the length
        
        System.out.println("Length "+s1.length());
        
        //Now we will change the all letter in upper case
        
        String str=s1.toUpperCase();
		System.out.println("upper case "+str);
		//for lower case
		System.out.println("Lower case: "+s1.toLowerCase());
		
		//For checking the string contains
		System.out.println("check String contains "+s1.contains("kant"));
		
		//for checking which letter is present between substring
		System.out.println("Sub String "+s1.substring(6,8));
		
		//for splitting the letter
		String result[]=s1.split(" ");
		for(String s:result)
		{
			System.out.println(s);
		}
		
		//for ignoring the cases lets check
          String s2="hello ravikant";
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("validated");
		else
			System.out.println("Not Valid");
	}

}
