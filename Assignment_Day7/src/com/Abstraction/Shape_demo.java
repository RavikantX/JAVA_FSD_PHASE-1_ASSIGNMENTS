package com.Abstraction;

public abstract class Shape_demo {
	private String color;
	abstract double area();
	
	public Shape_demo(String color)
	{
		System.out.println("Constructor called");
		this.color=color;
		}
	
	public String getcolor() {
		return color;
		
	}
	

}
