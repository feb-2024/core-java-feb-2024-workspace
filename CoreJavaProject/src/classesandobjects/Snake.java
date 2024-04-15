package classesandobjects;

public class Snake extends Animal{

	public String attacks() {
		return "Snake attacks!";
	}
	
	@Override
	public String mobility() {
		return "Snake crawls";
	}
}
