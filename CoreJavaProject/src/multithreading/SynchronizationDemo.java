package multithreading;

public class SynchronizationDemo {

	public static void main(String[] args) {
		PrinterResource resource = new PrinterResource();
		PrintRequestThread prt1 = new PrintRequestThread("request1", resource, "Hello");
		PrintRequestThread prt2 = new PrintRequestThread("request2", resource, "Java");
		PrintRequestThread prt3 = new PrintRequestThread("request3", resource, "Welcome");
		
		try {
			prt1.t.join();
			prt2.t.join();
			prt3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// expected output : 
		// [Hello]
		// [Welcome]
		// [Java]
	}

}
