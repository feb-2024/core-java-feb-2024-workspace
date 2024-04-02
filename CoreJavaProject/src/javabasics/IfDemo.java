package javabasics;

import java.util.Scanner;

public class IfDemo {

	static public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = scan.nextInt();
		
		// simple if
		// if(condn){
		//		true part
		// }
		System.out.println("simple if demo...");
		if(age < 18) {
			System.out.println("You are a minor!");
		}
		System.out.println("Welcome! Proceed Further!");
		System.out.println("-------------------");
		
		// if...else
		// if(condn){
		//		true part
		// } else {
		//  	false part
		// }
		System.out.println("if else demo...");
		if(age < 18) {
			System.out.println("You are a minor!");
		}else {
			System.out.println("You are a major!");
		}
		System.out.println("Welcome! Proceed Further!");
		System.out.println("-------------------");
		
		// else if ladder
		System.out.println("else if demo...");
		if(age > 0 && age < 18 ) {
			System.out.println("You are a minor!");
		} else if(age >= 18 && age < 65 ) {
			System.out.println("You are a major!");
		} else if(age >= 65) {
			System.out.println("You are a senior citizen!");
		} else { // false part
			System.out.println("Age is invalid!");
		}
		System.out.println("Welcome! Proceed Further!");
		System.out.println("-------------------");
		
		// nested if
		System.out.println("nested if else demo...");
		if(age < 18) {
			if(age <= 12) {
				System.out.println("You are a kid!");
			} else {
				System.out.println("You are a teenager!");
			}
			System.out.println("You are a minor!");
		}else {
			System.out.println("You are a major!");
		}
		System.out.println("Welcome! Proceed Further!");
		System.out.println("-------------------");
		
	}

}
