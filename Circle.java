package com.practice.constructor;

import java.util.Scanner;

// Question. Create a Circle class with radius. Initialize it using a constructor and calculate the area.

public class Circle {
	
	Scanner sc = new Scanner(System.in);
	
	double area;
	
	public Circle() {
		
		System.out.println("Enter radius of circle :");
		float radius = sc.nextFloat();
		
		area = 3.142 * radius * radius;
		
	}
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println("Area of Circle = "+c.area);
		
	}

}
