package arrays;

import java.util.Scanner;

public class ArrayPractiseQuestions {

	public static void main(String[] args) {
		// 37. Write a program to Search an item into the array using linear search
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter how many elements:");
		int size = scan.nextInt();
		
		int[] allElements = new int[size];
		
		System.out.println("Enter the elements one by one:");
		for(int i=0;i<allElements.length;i++) {
			allElements[i] = scan.nextInt();
		}
		
		System.out.println("Enter the element to be searched:");
		int searchElement = scan.nextInt();
		
		boolean flag = false;
		for(int i=0;i<allElements.length;i++) {
			if(searchElement == allElements[i]) {
				flag = true;
				System.out.println("Element found at position " + (i+1));
				break;
			}
		}
		if(!flag) {
			System.out.println("Element not present!");
		}
	}

}
