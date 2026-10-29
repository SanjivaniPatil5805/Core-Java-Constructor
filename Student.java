package com.practice.constructor;

// Question. Create a Student class with name and age. Initialize both using a default constructor.

public class Student {
	
	String name;
	
	int age;
	
	public Student(){
		
		name = "Rahul";
		age = 21;
		
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println("Student Name : "+s.name);
		System.out.println("Student Age : "+s.age);
		
		
	}

}
