package strings;

import java.util.Scanner;

public class StringDemo {
	
	public static String concatenateString(String st1, String st2) {
		// logic 1
		//String result = st1 + st2;
		
		// logic 2
//		String result = st1;
//		for(int i=0;i<st2.length();i++) {
//			result += st2.charAt(i);
//		}
		
		// logic 3
		String result = st1.concat(st2);
		return result;
	}

	public static void main(String[] args) {
		int mark = 50;
		String msg1 = "hello"; // recommended way of creating string objects
		String msg2 = new String("welcome");
		System.out.println(msg1);
		System.out.println(msg2);
		msg1 = "test";
		System.out.println(msg1);
		
		Scanner scan = new Scanner(System.in);
		
		//1. Write a Java program to concatenate Two strings 
//		System.out.println("Enter first string:");
//		String str1 = scan.next();
//		System.out.println("Enter second string:");
//		String str2 = scan.next();
//		
//		String output1 = concatenateString(str1, str2);
//		
//		System.out.println("Concatenated strings are:" + output1);
		
		//47. Write a program to Convert a character array to string
//		char[] myCharArray = {'e','l','e','p','h','a','n','t'};
//		String output2 = new String(myCharArray);
//		System.out.println(output2);
		
		//38. Write a Java program to Given string Convert Lowercase to Uppercase
//		System.out.println("Enter the string:");
//		String str3 = scan.next();
//		String output3 = str3.toUpperCase();
//		System.out.println(output3);
		
		//34. Write a Java program to reverse words in a given string
//		System.out.println("Enter the string:");
//		String str4 = scan.next();
//		String output4 = "";
//		for(int i=str4.length()-1;i>=0;i--) {
//			output4 += str4.charAt(i);
//		}
//		System.out.println(output4);
		
		//37. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'
//		String str5 = "String Exercises";
//		int index = str5.indexOf('x');
//		if(index== -1) {
//			System.out.println("Letter x is not present");
//		}else {
//			System.out.println("Letter x is present at index:" + index);	
//		}
//		
//		if(str5.contains('x'+"")){
//			System.out.println("Letter x is not present");
//		}else {
//			System.out.println("Letter x is present");
//		}
		
		//36. Write a Java program How to check Palindrome Strin
//		System.out.println("Enter the string:");
//		String str6 = scan.next();
		
		// logic 1
//		String output6 = "";
//		for(int i=str6.length()-1;i>=0;i--) {
//			output6 += str6.charAt(i);
//		}
//		if(str6.equals(output6)) {
//			System.out.println(str6 + " is a plaindrome!");
//		} else {
//			System.out.println(str6 + " is not a plaindrome!");
//		}
		
		// logic 2
//		boolean result = true;
//		for(int i=0, j=str6.length()-1; i<str6.length();i++,j--) {
//			if(str6.charAt(i) != str6.charAt(j)) {
//				result = false;
//				break;
//			}
//		}
//		if(result) {
//			System.out.println(str6 + " is a plaindrome!");
//		} else {
//			System.out.println(str6 + " is not a plaindrome!");
//		}
	}
}