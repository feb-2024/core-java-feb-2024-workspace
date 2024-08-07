package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> todoTasks = new PriorityQueue<>();
		
		todoTasks.add("Fill Petrol");
		todoTasks.add("Visit Bank to change phone number");
		todoTasks.add("Give dress to Tailor");
		todoTasks.add("Have lunch");
		
		todoTasks.forEach((eachTask)->System.out.print(" <--- " + eachTask));
		System.out.println();
		
		System.out.println("------------");
		todoTasks.remove();
		todoTasks.forEach((eachTask)->System.out.print(" <--- " + eachTask));
		System.out.println();
		
		System.out.println("------------");
		
	}

}
