package com.innerclass;

public class MethodLocalinner {
	
	public void display()
	{
		class inner {
			
			int a=52;
			
			void print()
			{
		System.out.println("Method of inner class");
		System.out.println("Value of a "+a);
		
		
		}
	}

		inner inner=new inner();
		inner.print();
		
}

	public static  void main(String[] args) {
		//Here we will use MethodLocalinner and what happens
		
		MethodLocalinner outer = new MethodLocalinner();
		outer.display();
	}
		
	}