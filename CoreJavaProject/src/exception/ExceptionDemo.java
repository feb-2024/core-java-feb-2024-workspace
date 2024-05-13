package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		try {
			c = a / b;
            // above line
			// 1. the JVM finds out that an exception of type ArithmeticException has occured
			// 2. the JVM implicitly creates an object of ArithmeticException
			// 3. the JVM implicitly throws the object
			// 4. now we have a catch block which catches ArithmeticException
			// 5. the control goes to the catch block, executes the code in the catch block and then the program continues after the catch block
		}catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			System.out.println("ArithmeticException has occured and is being fixed.");
			b = 1;
			c = a / b;
		}catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			// a finally blocvk will execute whether an exception is thrown or not thrown
			// this block is used to close the resources that were opened in the try block
		}
		
		System.out.println("Division over...");
		System.out.println("Answer is : " + c);
	}

}
