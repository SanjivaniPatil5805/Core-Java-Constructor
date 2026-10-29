package com.practice.constructor;

// Question. Create an Employee class with id, name, and salary. Initialize values using a parameterized constructor.

public class Employee {
	
	public Employee(int id, String name, double salary) {
		
        System.out.println("Employee ID = "+id);
		System.out.println("Employee Name = "+name);
		System.out.println("Salary = "+salary);
		
		
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee(12, "Priya", 65000.00);
		
		
	}

}
