package com.DifferentMapType;

import java.util.HashMap;

public class HashMap_demo {

	public static void main(String[] args) {
	HashMap<Integer , String> map= new HashMap<Integer , String>();
	 
	// here we will use map process and enter one integer value and one string value which wee have defined
	
	map.put(1, "Ravikant");
	map.put(4, "Satyam");
	map.put(45, "Anushka");
	map.put(10, "Shivam");
	map.put(18, "Sunny");
	map.put(null, "Roy");
	map.put(null, null);
	
	
	System.out.println(map);
	
	//AS Hashmap allow only one null key and multiple null value
	// then lets try by adding multiple null key
	
	map.put(null,"Singh");
	System.out.println(map);
	//we can see in result that null=null and null=Roy is not coming
	
	// if we want to get any element form the list then we can write the command as
	
	System.out.println("get element "+map.get(10));
	
	//here output comes as shivam
	
	
	
	
	

	}

}
