package com.Abstraction;

public class Circle extends Shape_demo {
	
private double radius;
	
	public Circle(double radius,String color)
	{
		super(color);
		this.radius=radius;
	}
	//For finding the area of circle
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color=" + getcolor() + " and area is "+area();
	}


}
