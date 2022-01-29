package com.area.perimeter.rectangle;

import java.util.Scanner;

public class Area_Perimeter {

	public static void main(String[] args) {
	int l , b , perimeter , area ;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter length of Rectangle");
	l = s.nextInt();
	System.out.println("Enter Breadth of Rectangle");
	b = s.nextInt();
	
	perimeter = 2 * (l + b);
	System.out.println("Perimeter of Reactangle is "+perimeter);
	
	area = l * b ;
	System.out.println("Area of Rectangle is "+area);
	
	

	}

}
