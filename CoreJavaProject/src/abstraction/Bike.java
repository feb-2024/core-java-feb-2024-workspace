package abstraction;

public abstract class Bike {
	public void start() {
		System.out.println("Started");
	}
	
	public void stop() {
		System.out.println("Stopped");
	}
	
	public abstract void accelerate();
}
