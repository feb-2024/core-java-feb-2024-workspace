package classesandobjects;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		System.out.println(animal1.breathe());
		System.out.println(animal1.mobility());
		
		System.out.println("---------------");
		
		Dog dog1 = new Dog();
		System.out.println(dog1.breathe());
		System.out.println(dog1.mobility());
		System.out.println(dog1.friendly());
		
		System.out.println("---------------");
		
		Snake snake1 = new Snake();
		System.out.println(snake1.breathe());
		System.out.println(snake1.mobility());
		System.out.println(snake1.attacks());
		
		System.out.println("---------------");

		Animal animal2 = new Dog(); // can I do this?, if yes what all can I access with animal2?
	}

}
