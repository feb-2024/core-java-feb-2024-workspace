package multithreading;

public class ChildRunnable implements Runnable{
	String name;
	Thread t;
	
	public ChildRunnable(String name) {
		this.name = name;
		this.t = new Thread(this);
		this.t.setName(name);
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(this.t.getName() + " : " + i);
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t.getName() + " : Completed...");
		}
	}

}
