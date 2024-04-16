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
		System.out.println(animal2.breathe());
		System.out.println(animal2.mobility()); // we have dynamic polymorphism here
		//System.out.println(animal2.friendly());
		
		System.out.println("---------------");
		
		Dog dog2 = (Dog)animal2; // we can downcast animal2 to Dog reference type
								 // downcasting has to be explicitly casted
		System.out.println(dog2.breathe());
		System.out.println(dog2.mobility()); // we don't have dynamic polymorphism
		System.out.println(dog2.friendly());
		
		System.out.println("---------------");
		
		Animal animal3 = dog2; // here we are upcasting dog2 to Animal reference type
							   // upcasting is done implicitly 
							   // so like this we can play with the referencde variables
		
		System.out.println("---------------");
		
		Room r1 = new Room(100,80,50);
		Room r2 = r1; // we can assign a reference variable to another reference variable
		
		
	}

}