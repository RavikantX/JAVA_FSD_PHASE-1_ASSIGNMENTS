package com.differentSetDemo;

import java.util.HashSet;

public class Hashset_demo {

	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	
	set.add("Banana");
	set.add("Apple");
	set.add("Ravikant");
	set.add("Mango");
	set.add(null);
	set.add("Goat");
	
	
	
	System.out.println("size"+set.size());
	System.out.println(set);
	
	//if we add to add any element then
	
	set.add("Pineapple");
	System.out.println(set);
	
	//if we add duplicate value then it will not show
	set.add("Mango");
	System.out.println(set);
	
	// if we want to remove any element then
	set.remove("Goat");
	System.out.println(set);
	
	//like this we can perform any task
	
	
	
	
	
	
	
	
	

	}

}
