package multithreading;

public class MainThreadDemo {

	public static void main(String[] args) {
		// here we are going to explore the main thread
		// first we should get a reference to the main thread
		Thread th = Thread.currentThread();
		System.out.println("Name : " + th.getName());
		System.out.println("ID : " + th.getId());
		System.out.println("Priority : " + th.getPriority());
		System.out.println("State : " + th.getState());
		System.out.println("Thread Group : " + th.getThreadGroup());

		th.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority : " + th.getPriority());
		
		System.out.println("-----------------");
		
		ChildThread child1 = new ChildThread("Child One");
		child1.start();
		//child1.run();
		
		ChildThread child2 = new ChildThread("Child Two");
		child2.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(th.getName() + " : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
