package com.DifferentMapType;

import java.util.Hashtable;

public class HashTable_demo {

	public static void main(String[] args) {
		Hashtable<Integer , String> map= new Hashtable<Integer , String>();
		 
		// here we will use map process and enter one integer value and one string value which wee have defined
		
		map.put(1, "Ravikant");
		map.put(4, "Satyam");
		map.put(45, "Anushka");
		map.put(10, "Shivam");
		map.put(18, "Sunny");
		//map.put(null, "Roy"); // i have omitted this because HashTable doesn't allow null value
		//map.put(null, null);
		
		
		System.out.println(map);
		
		// if we want to get any element form the list then we can write the command as
		
		System.out.println("get element "+map.get(10));
		
		//here output comes as shivam..

	}

}
