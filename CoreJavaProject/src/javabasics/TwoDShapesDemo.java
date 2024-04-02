package javabasics;

import java.util.Scanner;

public class TwoDShapesDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char answer = 'y';
		do {
			System.out.println("************************");
			System.out.println("2D SHAPES");
			System.out.println("************************");
			System.out.println("1. Rectangle");
			System.out.println("2. Circle");
			System.out.println("3. Triangle");
			System.out.println("4. Exit");
			System.out.println("************************");
			System.out.println("Please choose an option:");
			int option = scan.nextInt();
			System.out.println("************************");		
			switch(option) {
				case 1:
					System.out.println("You have selected Rectangle...");
					System.out.println("Enter length: ");
					double length = scan.nextDouble();
					
					System.out.println("Enter width: ");
					double width = scan.nextDouble();
			
					double areaAnswer = TwoDShapes.computeAreaRectangle(length, width);
					double perimeterAnswer = TwoDShapes.computePerimeterRectangle(length, width);
					
					System.out.println("Area of rectangle with length " + length + " and width " + width + " is " + areaAnswer + " sq. units");
					System.out.println("Perimeter of rectangle with length " + length + " and width " + width + " is " + perimeterAnswer + " units");
					
					break;
				case 2:
					System.out.println("You have selected Circle...");
					System.out.println("Enter radius: ");
					double radius = scan.nextDouble();
					
					double areaCircle = TwoDShapes.computeAreaCircle(radius);
					double perimeterCircle = TwoDShapes.computePerimeterCircle(radius);
					
					System.out.println("Area of circle with radius " + radius + " is " + areaCircle + " sq. units");
					System.out.println("Perimeter of circle with radius " + radius + " is " + perimeterCircle + " units");
					
					break;
					
				case 3:
					System.out.println("You have selected Triangle...");
					System.out.println("Enter base/side1: ");
					double base = scan.nextDouble();
					
					System.out.println("Enter heigth: ");
					double height = scan.nextDouble();
			
					System.out.println("Enter side2: ");
					double side2 = scan.nextDouble();
					
					System.out.println("Enter side3: ");
					double side3 = scan.nextDouble();
					
					double areaTriangle = TwoDShapes.computeAreaTriangle(base, height);
					double perimeterTriangle = TwoDShapes.computePerimeterTriangle(base, side2, side3);
					
					System.out.println("Area of triangle with base " + base + " and heigth " + height + " is " + areaTriangle + " sq. units");
					System.out.println("Perimeter of triangle with side1 " + base + ", side2 " + side2 + " and side3 " + side3 + " is " + perimeterTriangle + " units");
					
					break;
				case 4:
					System.out.println("****************************************");
					System.out.println("THANKYOU! Exiting the application!");
					System.out.println("****************************************");
					System.exit(0);
					
				default:
					System.out.println("************************");
					System.out.println("Please choose a valid option!");
					System.out.println("************************");
			}
			System.out.println("Do you want to continue? (y/n) : ");
			answer = scan.next().charAt(0);
		} while( answer == 'y');
			
		System.out.println("****************************************");
		System.out.println("THANKYOU! Exiting the application!");
		System.out.println("****************************************");
	}
}
