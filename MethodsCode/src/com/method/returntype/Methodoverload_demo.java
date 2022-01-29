package com.method.returntype;

public class Methodoverload_demo {
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		Methodoverload_demo m=new Methodoverload_demo();
		System.out.println("Addition if 2 int "+m.add(23, 4));
		System.out.println("Addition of 2 float "+m.add(23.0f, 9.78f));
		System.out.println("Addition of 2 double "+m.add(2.3, 6.7));
		System.out.println("Additon of 3 int "+m.add(4, 6, 9));

}
}
