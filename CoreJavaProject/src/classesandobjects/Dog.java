package classesandobjects;

public class Dog extends Animal {
	public String friendly() {
		return "Dog is friendly";
	}
	
	@Override
	public String mobility() {
		return "Dog runs";
	}
}