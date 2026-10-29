package com.practice.constructor;

import java.util.Scanner;

// Question. Create a Calculator class with two numbers. Initialize them using a constructor and perform addition, subtraction, multiplication, and division.

public class Calculator {
	
	int num1 , num2;
	
	Scanner sc = new Scanner(System.in);
	
	public Calculator() {
		
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		num2= sc.nextInt();
		
	}
	
	public void addition() {
		
		System.out.println(num1 + " + "+ num2 + " = "+(num1+num2));
		
	}
	
	public void subtraction() {
		
		System.out.println(num1 + " - "+ num2 + " = "+(num1-num2));
		
	}
	
	public void multiplication() {
		
		System.out.println(num1 + " * "+ num2 + " = "+(num1*num2));
		
	}
	
	public void division() {
		
		System.out.println(num1 + " / "+ num2 + " = "+(num1/num2));
		
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
		
	}

}
