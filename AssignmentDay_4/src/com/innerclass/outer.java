package com.innerclass;

public class outer {
	public int a=20;
	private String b="Welcome";
	
	class Inner
	{
		public void display()
		{
			System.out.println("Value of a "+a);
			System.out.println("Value of b "+b);
		}
	}
	
	public static void main(String[] args) {
		outer outer=new  outer();
		outer.Inner inner=outer.new Inner();
		
		inner.display();

}
}
