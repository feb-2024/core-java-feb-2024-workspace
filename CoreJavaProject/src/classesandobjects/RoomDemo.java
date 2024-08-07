package classesandobjects;

public class RoomDemo {

	public static void main(String[] args) {
////		int mark;
////		mark = 50;
//		
//		int mark = 50;
//		
//		// here we are going to create an object for Room class
////		Room studyRoom;  // in this line Room object is not created
////		studyRoom = new Room(); // only in this after the use of new keyword room object is created
//		
//		Room studyRoom = new Room(200, 180, 150);
//		//studyRoom.length = 200;
//		//studyRoom.width = 180;
//		//studyRoom.height = 150;
//		
//		int studyFloorArea = studyRoom.calculateFloorArea();
//		System.out.println("Floor area of studyRoom is : " + studyFloorArea + " units ");
//		
//		int cost = studyRoom.calculateWallPaintingCost(2);
//		System.out.println("Cost of painting studyRoom walls : Rs." + cost);
//		
//		Room diningRoom = new Room(400, 200, 150);
////		diningRoom.length = 400;
////		diningRoom.width = 200;
////		diningRoom.height = 150;
//		
//		System.out.println("Floor area of diningRoom is : " + diningRoom.calculateFloorArea() + " units ");
//		System.out.println("Cost of painting diningRoom walls : Rs." + diningRoom.calculateWallPaintingCost(3));
//		
//		Room livingRoom = new Room(500, 250, 150, "lightpink");
//		System.out.println("Floor area of livingRoom is : " + livingRoom.calculateFloorArea() + " units ");
//		System.out.println("Cost of painting livingRoom walls : Rs." + livingRoom.calculateWallPaintingCost(1));
//		
//		Room bedRoom = new Room(250, 200, 150, "lightblue", 101);
//		System.out.println("Floor area of bedRoom is : " + bedRoom.calculateFloorArea() + " units ");
//		System.out.println("Cost of painting bedRoom walls : Rs." + bedRoom.calculateWallPaintingCost(1));
		
		
		// demo to work with Object
		Room room1 = new Room(200, 180, 150);
		Room room2 = new Room(200, 180, 150);
		Room room4 = new Room(400, 300, 150);
		Room room3 = room1;
		
		// == here is performing reference equality
		// reference equality checks for address equality
		System.out.println("room1 == room2 : " + (room1 == room2)); // false
		System.out.println("room1 == room3 : " + (room1 == room3)); // true
		System.out.println("room3 == room4 : " + (room3 == room4)); // false
		System.out.println("room4 == room1 : " + (room4 == room1)); // false
		
		// we want to perform content equality and hence we call the equals method of super class Object
		// but the super class Object's equals methods performs reference equality and hence we get the same output.
		// so we override the equals methods in the Room class and write our logic to perform content equality.
		// so after overriding equals methods the output is different because it performs content equality.
		System.out.println("room1.equals(room2) : " + (room1.equals(room2))); // false , after overriding equals we got true
		System.out.println("(room1.equals(room3) : " + (room1.equals(room3))); // true , after overriding equals we got true
		System.out.println("(room3.equals(room4) : " + (room3.equals(room4))); // false , after overriding equals we got false
		System.out.println("(room4.equals(room1) : " + (room4.equals(room1))); // false , after overriding equals we got false
		
		System.out.println("room1: " + room1.hashCode());
		System.out.println("room2: " + room2.hashCode());
		System.out.println("room3: " + room3.hashCode());
		System.out.println("room4: " + room4.hashCode());
		
		System.out.println(room1);
		System.out.println(room1.toString());
	}

}
