package multithreading;

public class ChildPriority implements Runnable{
	int counter;
	Thread t;
	
	public ChildPriority(String name, int priority) {
		t = new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		t.start();
	}

	@Override
	public void run() {
		while(true) {
			counter++;
		}
	}

}
