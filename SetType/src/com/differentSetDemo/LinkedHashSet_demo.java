package com.differentSetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSet_demo {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Banana");
		set.add("Apple");
		set.add("Ravikant");
		set.add("Mango");
		set.add(null);
		set.add("Goat");
		
		
		
		System.out.println("size"+set.size());
		System.out.println(set);
		
		//AS this is similar to hash set then we can perform all the action which
		//we have performed earlier
		//if we add to add any element then
		
		set.add("Pineapple");
		System.out.println(set);
		
		//if we add duplicate value then it will not show
		set.add("Mango");
		System.out.println(set);
		
		// if we want to remove any element then
		set.remove("Goat");
		System.out.println(set);

	}

}
