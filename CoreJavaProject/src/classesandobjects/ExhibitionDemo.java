package classesandobjects;

public class ExhibitionDemo {

	public static void main(String[] args) {
		Exhibition exhibition = new Exhibition();
		
		Dog dog = new Dog();
		exhibition.exhibit(dog);
		
		Snake snake = new Snake();
		exhibition.exhibit(snake);
		
	}

}