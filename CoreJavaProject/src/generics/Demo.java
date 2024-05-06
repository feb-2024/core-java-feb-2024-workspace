package generics;

public class Demo {

	public static void main(String[] args) {
		Box box = new Box(100,50,20);
		System.out.println("box : " + box);
		//Box box1 = new Box(200.5, 150.75, 100.25);
		
		BoxGenerics<Integer> box2 = new BoxGenerics<Integer>(250, 150, 100);
		System.out.println("box2 : " + box2);
		
		BoxGenerics<Float> box3 = new BoxGenerics<Float>(200.5f, 150.75f, 100.25f);
		System.out.println("box3 : " + box3);
	}

}
