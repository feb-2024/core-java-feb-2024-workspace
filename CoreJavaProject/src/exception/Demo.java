package exception;

public class Demo {

	// try, catch, finally, throw , throws
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		
		c = a / b;
		// in the above line
		// 1. the JVM finds out that an exception of type ArithmeticException has occured
		// 2. the JVM implicitly creates an object of ArithmeticException
		// 3. the JVM implicitly throws the object
		// 4. since the object thrown is not caught in the program the control moves out of the program and goes to the default handler
		// 5. the default handler catches the exception and displays the exception message with the stack trace
		// 6. once the control goes to the default handler, it can never come back to the program
		
		System.out.println("Division over...");
		System.out.println("Anser is : " + c);
	}
}