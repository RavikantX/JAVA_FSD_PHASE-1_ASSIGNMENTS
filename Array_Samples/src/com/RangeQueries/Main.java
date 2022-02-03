package com.RangeQueries;

public class Main {

	public static void main(String[] args) {
	  
		int arr[] = { 3, 7, 2, 5, 8, 9 }; 
        int n = arr.length;

        RangeQueries.buildSparseTable(arr, n); 
        
        // To get the value between index 0 and 5 we will write as
        System.out.println(RangeQueries.query(0, 5));
        
        //  To get the value between index 2 and 5we will write as
        System.out.println(RangeQueries.query(2, 5)); 
        
        // To get the value between index 3 and 5 we will write as
        System.out.println(RangeQueries.query(3, 5)); 

	}

}
