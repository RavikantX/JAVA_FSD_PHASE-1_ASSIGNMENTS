package com.differentSetDemo;

import java.util.TreeSet;

public class TreeSet_demo {

	public static void main(String[] args) {
	
     TreeSet<String> set = new TreeSet<String>();
		
		set.add("Banana");
		set.add("Apple");
		set.add("Ravikant");
		set.add("Mango");
		
		//set.add(null);  This is removed because null is not allowed in tree set
		
		set.add("Goat");

		System.out.println("size"+set.size());
		System.out.println(set);
		
		//if we add to add any element then
		
				set.add("Pineapple");
				System.out.println(set);
				// Result is shown in Ascending order
				
				//if we add duplicate value then it will not show
				set.add("Mango");
				System.out.println(set);
				
				// if we want to remove any element then
				set.remove("Goat");
				System.out.println(set);

				
		
	}

}
