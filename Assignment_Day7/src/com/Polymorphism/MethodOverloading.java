package com.Polymorphism;

public class MethodOverloading {

	  // Here we will write a code for compile time polymorphism
	public int sum(int x,int y)
	{
		return x+y;
	}
	public int sum(int x ,int y ,int z)
	{
		return x+y+z ;
	}
	public static void main(String[] args) {
		MethodOverloading  m= new MethodOverloading ();
		System.out.println(m.sum(5, 8));
		System.out.println(m.sum(4,6 ,13));
		
		
	}
	
	
}
