package com.UncheckedException;

public class OutOfBoundException_demo {

	public static void main(String[] args) {
	
		int array[]= { 5, 6, 8, 55, 65,85};
		//System.out.println(array[5]); //for this it will show number at index 4 as 85
		System.out.println(array[6]);
		// but if we put array[6] then it will show OutOfBoundException
		
	}

}
