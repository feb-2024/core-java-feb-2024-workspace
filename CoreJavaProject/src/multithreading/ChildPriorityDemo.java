package multithreading;

public class ChildPriorityDemo {

	public static void main(String[] args) {
		ChildPriority child1 = new ChildPriority("High Priority Child", Thread.MAX_PRIORITY);
		ChildPriority child2 = new ChildPriority("Low Priority Child", Thread.MIN_PRIORITY);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		child1.t.stop();
		child2.t.stop();
		
		System.out.println(child1.t.getName() + " : " + child1.counter);
		System.out.println(child2.t.getName() + " : " + child2.counter);
		
	}

}
