package com.practice.constructor;

// Question. Create a Rectangle class with two constructors: one with no parameters and another with length and width. Calculate the area using both.

public class Rectangle {
	
	double area;
	double length;
	double width;
	
	public Rectangle() {
		
		length = 10.0;
		width = 5.0;
		
		area = length * width;
		
		System.out.println("Area of Rectangle whose length is "+length+ " and width is "+width+" = "+area);
		
	}
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
		
		area = length * width;
		System.out.println("Area of Rectangle whose length is "+length+ " and width is "+width+" = "+area);
		
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(8.0,4.0);
		
	}

}
