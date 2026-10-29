package com.practice.constructor;

// Question. Create a Car class with brand, color, and speed. Initialize the fields using a constructor.

public class Car {
	
	String brand;
	String color;
	String speed;
	
	public Car() {
		
		this.brand = "swift";
		this.color = "red";
		this.speed = "200km/hr";
		
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println("Car brand = "+c.brand);
		System.out.println("Car color = "+c.color);
		System.out.println("Car speed = "+c.speed);
		
	}

}
