package exception;

public class ThrowDemo {

	public static void main(String[] args) {
		
//		try {
//			ArithmeticException ae = new ArithmeticException("exception occured!");
//			throw ae;	
//		}catch(ArithmeticException a) {
//			System.out.println(a.getMessage());
//		}
		
		int opt = 3;
		try {
			if(opt <= 0 || opt > 5) {
				InvalidOptionException ioe = new InvalidOptionException(opt);
				throw ioe;
			}else {
				System.out.println("Option entered is:" + opt);
			}
		}catch(InvalidOptionException i) {
			System.out.println(i.getMessage());
		}
		System.out.println("Completed...");
	}

}
