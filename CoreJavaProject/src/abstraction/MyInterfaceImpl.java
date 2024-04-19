package abstraction;

public class MyInterfaceImpl implements  MyInterface{

	@Override
	public void display() {
		System.out.println(AGE);
		System.out.println("in display implementation");
	}
	
	public void message() {
		System.out.println(show());
		System.out.println(MyInterface.print());
	}
}
