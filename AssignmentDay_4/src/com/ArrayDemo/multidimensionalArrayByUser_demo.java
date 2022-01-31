package com.ArrayDemo;

import java.util.Scanner;

public class multidimensionalArrayByUser_demo {

	public static void main(String[] args) {
	
int array[][]= new int[2][2];
		
//for 2*2 matrix
		System.out.println("Store element in matrix");
		Scanner sc=new Scanner(System.in);
		for(int row=0;row<2;row++)
		{
			for(int col=0;col<2;col++)
			{	
				System.out.println("Enter Any number");
				array[row][col]= sc.nextInt();
			}
		}
		
		System.out.println("Print matrix");
		for(int row=0;row<2;row++)
		{
			for(int col=0;col<2;col++)
			{
				System.out.print(array[row][col]+"\t");
			}
			System.out.println();

	}
	}

}
