package multithreading;

public class PrintRequestThread implements Runnable{

	Thread t;
	String name;
	PrinterResource pr;
	String message;
	
	public PrintRequestThread(String name, PrinterResource pr, String message) {
		t = new Thread(this);
		this.message = message;
		this.name = name;
		this.pr = pr;
		t.start();
	}

	@Override
	public void run() {
		synchronized(pr) {
			pr.print(message);	
		}		
	}
	
}
