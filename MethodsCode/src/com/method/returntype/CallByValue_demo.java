package com.method.returntype;

public class CallByValue_demo {
	//class level variable, access using this keyword
		int num=150;
		
		void operation(int num)
		{
			this.num=num*10/200;
		}
		
		public static void main(String[] args) {
			CallByValue_demo c=new CallByValue_demo();
			System.out.println("Value of num Before function call "+c.num);
			
			c.operation(50);
			System.out.println("Value of num After function call "+c.num);

}
}
