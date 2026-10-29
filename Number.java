package com.practice.constructor;

import java.util.Scanner;

// Question. Create a Number class with one integer variable. Initialize it using a constructor and check whether the number is even or odd.

public class Number {
	
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	public Number() {
		
		System.out.println("Enter a number :");
		num = sc.nextInt();
		
	}
	
	public void evenOdd(){
		
		if(num % 2 == 0) {
			
			System.out.println("Even Number");
			
		} else {
			
			System.out.println("Odd Number");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Number n = new Number();
		n.evenOdd();
		
	}
	
	

}
