package javabasics;

import java.util.Scanner;

public class InputUsingScannerDemo {

	public static void main(String[] args) {
		// we have to take a students's id, age, math mark, science mark, city as input
		// calculate the average mark and display all the details
		
		// input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student's ID: ");
		int studId = scan.nextInt();
		
		System.out.println("Enter Student's age: ");
		int studAge = scan.nextInt();
		
		System.out.println("Enter Student's math mark: ");
		int studMathMark = scan.nextInt();
		
		System.out.println("Enter Student's science mark: ");
		int studScienceMark = scan.nextInt();
		
		System.out.println("Enter Student's city: ");
		String studCity = scan.next();
		
		// process
		double studAvgMark = (studMathMark + studScienceMark) / 2;
		
		// output
		System.out.println("Student's ID: " + studId);
		System.out.println("Student's age: " + studAge);
		System.out.println("Student's math mark: " + studMathMark);
		System.out.println("Student's science mark: " + studScienceMark);
		System.out.println("Student's average mark: " + studAvgMark);
		System.out.println("Student's city: " + studCity);
		
	}

}
