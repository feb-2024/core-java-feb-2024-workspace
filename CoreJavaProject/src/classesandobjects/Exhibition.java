package classesandobjects;

public class Exhibition {
//	public void exhibit(Dog dog) {
//		System.out.println(dog.breathe());
//		System.out.println(dog.mobility());
//		System.out.println(dog.friendly());
//	}
//	
//	public void exhibit(Snake snake) {
//		System.out.println(snake.breathe());
//		System.out.println(snake.mobility());
//		System.out.println(snake.attacks());
//	}
	
// tomorrow if 10 more animals have to be exhibited, we have to write 10 more exhibit methods
// this becomes tedious, and we can get the same result with one method as below
	
	public void exhibit(Animal animal) {
		System.out.println(animal.breathe());
		System.out.println(animal.mobility());
		// how can i access the extra methods of Dog and Snake class?
	}
	
}
