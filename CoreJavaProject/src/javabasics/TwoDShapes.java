package javabasics;

// int a = 10; // not possible

// this class does not have the main method
public class TwoDShapes {
	static double PI = 3.14; // here PI is static variable
	//double marks = 20; // here marks is an instance variable
	
	public static double computeAreaRectangle(double length, double width) {
		double area = length * width; // here area is a local variable, length and width are also local variables
		return area;
	}
	
	public static double computeAreaCircle(double radius) {
		double area = PI * radius * radius;
		return area;
	}
	
	public static double computeAreaTriangle(double base, double height) {
		double area = 0.5 * base * height;
		return area;
	}
	
	public static double computePerimeterCircle(double radius) {
		double perimeter = 2 * PI * radius;
		return perimeter;
	}
	
	public static double computePerimeterRectangle(double length, double width) {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public static double computePerimeterTriangle(double side1, double side2, double side3) {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
}
