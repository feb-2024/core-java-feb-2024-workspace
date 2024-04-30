package arrays;

import java.util.Scanner;

public class ArrayPractiseQuestions {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter how many elements:");
		int size = scan.nextInt();
		
		int[] allElements = new int[size];
		
		System.out.println("Enter the elements one by one:");
		for(int i=0;i<allElements.length;i++) {
			allElements[i] = scan.nextInt();
		}
		
		// 37. Write a program to Search an item into the array using linear search
//		System.out.println("Enter the element to be searched:");
//		int searchElement = scan.nextInt();
//		
//		boolean flag = false;
//		for(int i=0;i<allElements.length;i++) {
//			if(searchElement == allElements[i]) {
//				flag = true;
//				System.out.println("Element found at position " + (i+1));
//				break;
//			}
//		}
//		if(!flag) {
//			System.out.println("Element not present!");
//		}
		
//		//3. Write a program to print sum values of an array
//		int sum = 0;
//		for(int i=0;i<allElements.length;i++) {
//			sum += allElements[i];
//		}
//		System.out.println("Sum is:" + sum);
//		
//		//4. Write a program to calculate the average value of array elements
//		double avg = sum / allElements.length;
//		System.out.println("Average is:" + avg);
		
		//8. Write a program in to read n number of values in an array and display it in reverse order
//		for(int i=allElements.length-1;i>=0;i--) {
//			System.out.println(allElements[i]);
//		}
		
		//9. Write a program to array elements to print cubic values
//		for(int i=0;i<allElements.length;i++) {
//			System.out.println("Number:" + allElements[i] + "     Cubic Value:" + (allElements[i] * allElements[i] * allElements[i]));
//		}
		
		//10. Write a program to find the maximum and minimum element in an array
//		int minValue = allElements[0];
//		int maxValue = allElements[0];
//		
//		for(int i=1;i<allElements.length;i++) {
//			if(allElements[i] < minValue) {
//				minValue = allElements[i];
//			}
//			if(allElements[i] > maxValue) {
//				maxValue = allElements[i];
//			}
//		}
//		System.out.println("Minimum value : " + minValue);
//		System.out.println("Maximum value : " + maxValue);
		
		//11. Write a program to array elements print all Odd number
//		for(int i=0;i<allElements.length;i++) {
//			if(allElements[i] % 2 !=0) {
//				System.out.println(allElements[i]);
//			}
//		}
		
		//17. Write a program to merge two arrays elements to store in third array
		
//		System.out.println("Enter how many elements for second array:");
//		int size2 = scan.nextInt();
//		
//		int[] allElements2 = new int[size2];
//		
//		System.out.println("Enter the elements one by one for second array:");
//		for(int i=0;i<allElements2.length;i++) {
//			allElements2[i] = scan.nextInt();
//		}
//		
//		int[] allElements3 = new int[size+size2];
//		for(int i=0;i<allElements.length;i++) {
//			allElements3[i] = allElements[i];
//		}
//		
//		int endPosition = allElements.length;
//		
//		for(int i=0;i<allElements2.length;i++) {
//			allElements3[endPosition++] = allElements2[i];
//		}
//		for(int i=0;i<allElements3.length;i++) {
//			System.out.println(allElements3[i]);
//		}
		
		//33. Write a program to Sort an array in ascending order using bubble sort
//		for(int i=0;i<allElements.length;i++) {
//			for(int j=0;j<allElements.length-i-1;j++) {
//				if(allElements[j]>allElements[j+1]) {
//					int temp = allElements[j];
//					allElements[j] = allElements[j+1];
//					allElements[j+1] = temp;
//				}
//			}
//		}
//		System.out.println("SORTED ARRAY:");
//		for(int i=0;i<allElements.length;i++) {
//			System.out.println(allElements[i]);
//		}
		
		//38. Write a program to Find prime and non-prime numbers in the array
//		for(int i=0;i<allElements.length;i++) {
//			boolean isPrime = true;
//			for(int j=2;j<allElements[i]/2;j++) {
//				if(allElements[i]%j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if(isPrime) {
//				System.out.println(allElements[i] + " : is Prime" );
//			}else {
//				System.out.println(allElements[i] + " : is not Prime" );
//			}
//		}
		
		//39. Write a program to Move all zero at the end of the array
		// quadratic time complexity O(n^2)
//		for(int i=0;i<allElements.length;i++) {
//			if(allElements[i] == 0) {
//				for(int j=i;j<allElements.length-1;j++) {
//					allElements[j] = allElements[j+1];
//				}
//				allElements[allElements.length-1] = 0;
//			}
//		}
//		System.out.println("THE ARRAY:");
//		for(int i=0;i<allElements.length;i++) {
//			System.out.println(allElements[i]);
//		}
		
		// linear time complexity O(n)
		int[] allElements2 = new int[size];
		int j = 0;
		for(int i=0;i<allElements.length;i++) {
			if(allElements[i]!=0) {
				allElements2[j++] = allElements[i];
			}
		}
		System.out.println("THE ARRAY:");
		for(int i=0;i<allElements2.length;i++) {
			System.out.println(allElements2[i]);
		}
	}

}
