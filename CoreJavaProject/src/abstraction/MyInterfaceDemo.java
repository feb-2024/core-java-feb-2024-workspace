package abstraction;

public class MyInterfaceDemo {

	public static void main(String[] args) {
		MyInterfaceImpl impl = new MyInterfaceImpl();
		impl.display();
		impl.message();
	}

}
