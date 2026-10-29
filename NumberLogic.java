package com.practice.constructor;

import java.util.Scanner;

// Question. Create a NumberLogic class with a number variable. Initialize it using a constructor and check whether it is a palindrome.

public class NumberLogic {

	Scanner sc = new Scanner(System.in);

	int num;

	public NumberLogic() {
		
		System.out.println("Enter a number :");
		num = sc.nextInt();
		
		int temp = num;
		
		int rev = 0;
		
		while(num >= 1) {
			
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}
		
		if(rev == temp) {
			
			System.out.println("Palindrom Number");
			
		} else {
			
			System.out.println("Not a Palindrom Number");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		NumberLogic n = new NumberLogic();
		
	}
	
	
}
