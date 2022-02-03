package com.Abstraction;

public class Rectangle extends Shape_demo{
	

	private double length;
	private double width;
	
	public Rectangle(double length,double width,String color)
	{
		super(color);
		this.length=length;
		this.width=width;
	}
	 //For finding the area of Rectangle
	double area() {
		return length*width;
	}

	@Override
	public String toString() {
		return "Rectangle color=" + getcolor() + " and area is "+area();
	}

  }
  
