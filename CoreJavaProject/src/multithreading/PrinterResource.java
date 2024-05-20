package multithreading;

public class PrinterResource {

	//public synchronized void print(String msg) {
	public void print(String msg) {
		System.out.print("[");
		System.out.print(msg);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
