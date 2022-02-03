package com.statics;

public class Main {

	public static void main(String[] args) {
       KthSmallest ob = new KthSmallest(); 
		
        int arr[] = {12, 33, 57, 44, 19, 26}; 
        
        //first index
        int left=0;
        
        int n = arr.length;
        
        //last index
        int right= n-1; 
        int k = 5; 
        
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, left, right, k)); 

	}

}
