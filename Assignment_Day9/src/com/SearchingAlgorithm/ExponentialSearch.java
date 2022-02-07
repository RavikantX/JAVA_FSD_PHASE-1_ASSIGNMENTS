package com.SearchingAlgorithm;

import java.util.Arrays;

public class ExponentialSearch {
	 
	public static  void main(String[] args){
         
		//Algorithm for Exponential search method
	    int[] arr = {16,12,28,24,32};
	    int length= arr.length;
	    int value = 12;
	    int outcome = exponentialSearch(arr,length,value);

	    if(outcome<0){

	       System.out.println( "Element is not present in the array");

	    }else {

	        System.out.println( "Element is  present in the array at index :"+outcome);
	    }

	        }

	        public static int exponentialSearch(int[] arr ,int length, int value ){

	       //check if the element available at first index
	        if(arr[0]==value){
	            return 0;
	            }
	      //find out the range by repeated doubling
	        int i=1;
	        
	        while(i<length && arr[i]<=value){

	            i=i*2;
	        }
	        
	        //call binary search
	        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);

}
}
