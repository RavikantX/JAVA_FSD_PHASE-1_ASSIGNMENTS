package com.LongestSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
           // Project code for Longest Increasing Subsequence
public class LongestSubSequence {

	public static void main(String[] args) {
	
		//Here we will write the code so that user can decide the size of the Array
		System.out.println("Please enter the required size of the array ");
	    Scanner sc = new Scanner(System.in);
	
	    //Here we will use Try catch method to handle the Exception
	    try{
	    	int n = sc.nextInt();
	    	try{
	    		if(n<100){
	    			int a[] = new int[n];
	    			System.out.println("Please enter the elements of the array one by one ");
	    			for (int i = 0; i < n; i++){
	    				a[i] = sc.nextInt();
	                }
	    			System.out.println("Contents of the array are: " + Arrays.toString(a));
	                LongestSubSequence ob = new LongestSubSequence();
	                ob.longestSubseq(a, n);
	            }
	    		else{
	    			throw new Exception();
	            }
	        }
	    	catch(Exception ex){
	    		System.out.println("Input must be greater than 0 and less than 100");
	            main(new String[] { "" });
	        }
	    }
	    catch(Exception ex){
	    	System.out.println("Please provide input as integer");
	    	main(new String[] { "" });
	    }
	}
	
	//Main method
	public void longestSubseq(int[] array, int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
	    ArrayList<Integer> longestList = new ArrayList<Integer>();
	    int currentMax;
	    int highestCount = 0;
	    for (int i = 0; i < array.length; i++){
	    	currentMax = Integer.MIN_VALUE;
	    	for (int k = i; k < array.length; k++){
	    		if (array[k] > currentMax){
	    			list.add(array[k]);
	    			currentMax = array[k];
	            }
	         }
	    	if (highestCount < list.size()){
	    		highestCount = list.size();
	    		longestList = new ArrayList<>(list);
	        }
	    	list.clear();
	    }
	    System.out.println();
	    Iterator<Integer> itr = longestList.iterator();
	    System.out.println("The Longest subsequence"); //To print the longest subsequence 
	    while (itr.hasNext()){
	    	System.out.print(itr.next() + " ");
	    }
	    
	    //To print the length of the list 
	    System.out.println();
	    System.out.println("Length of LIS: " + highestCount);

	}

}
