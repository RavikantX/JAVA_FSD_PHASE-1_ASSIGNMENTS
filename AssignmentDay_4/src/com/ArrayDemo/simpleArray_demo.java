package com.ArrayDemo;

public class simpleArray_demo {

	public static void main(String[] args) {

        int array[]= {12,23,34,45,56,67,78};
        
		//for printing element at different index
		System.out.println("Element at index 4 "+array[4]);
		
		//for printing the total length
		System.out.println("Length of an array "+array.length);
		
		//using for loop
		System.out.println("access same using for loop");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ,");
		}
		System.out.println();
		
		//using for each loop
		System.out.println("access same using for each loop");
		for(int a :array)
		{
			System.out.print(a+" ,");
	}

}
}
