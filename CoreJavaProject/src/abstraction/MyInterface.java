package abstraction;

public interface MyInterface {
	int AGE = 21; // this is by default public static final
	
	void display(); // this is by default public abstract
	
	default String show() {
		System.out.println(myMethod());
		return "in show default method";
	}
	
	static String print() {
		return "in print static method";
	}
	
	private String myMethod() {
		return "private method";
	}
}
