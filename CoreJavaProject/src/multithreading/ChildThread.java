package multithreading;

public class ChildThread extends Thread{
	String name;
	
	public ChildThread(String name) {
		this.name = name;
		setName(name);
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
