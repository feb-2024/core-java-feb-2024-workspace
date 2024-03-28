package javabasics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		// print whether a day is a weekday or a weekend
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day: ");
		String day = scan.next();
		
		switch(day) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			//case "Monday":
			case "Friday":
				System.out.println(day + " is a weekday");
				break;
			case "Saturday":
			case "Sunday":
				System.out.println(day + " is a weekend");
				break;
			default:
				System.out.println(day + " is an invalid day");
		}
		System.out.println("Have a Good Day!");

//		long num = 5;
//		
//		 switch (num) {
//	     case 4 -> System.out.println("4");
//	     case 5 -> System.out.println("5");
//	     default -> throw new ClassCastException("can not accept");

		switch(day) {
		
     }

//		 double a=1.33D;
//         switch(a){
//         default:
//             a%=a;
//         case 1.333:
//             a++;break;
//         case 1.3:
//             a+=a;break;
//         }
//         System.out.print(a);
	}

}
