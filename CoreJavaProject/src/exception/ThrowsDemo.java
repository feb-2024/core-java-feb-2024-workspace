package exception;

public class ThrowsDemo {

	public static void method2() throws ArithmeticException, InvalidOptionException{
		// some code here which throws an exception
		int a = 5;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		c = a / b;
		System.out.println("Division over...");
		System.out.println("Answer is : " + c);
	}
	
	public static void method1() throws ArithmeticException, InvalidOptionException{
		//try {
			method2();
		//}catch(ArithmeticException ae) {
			//System.out.println(ae.getMessage());
		//}catch(InvalidOptionException ioe){
			//System.out.println(ioe.getMessage());
		//}
	}
	
	public static void main(String[] args) throws ArithmeticException, InvalidOptionException{ // avoid this and is not recomended
		//try {
			method1();	
		//}catch(ArithmeticException ae) {
			//System.out.println(ae.getMessage());
		//}
		
	}
}
