package classesandobjects;

public class RoomDemo {

	public static void main(String[] args) {
//		int mark;
//		mark = 50;
		
		int mark = 50;
		
		// here we are going to create an object for Room class
//		Room studyRoom;  // in this line Room object is not created
//		studyRoom = new Room(); // only in this after the use of new keyword room object is created
		
		Room studyRoom = new Room();
		studyRoom.length = 200;
		studyRoom.width = 180;
		studyRoom.height = 150;
		
		int studyFloorArea = studyRoom.calculateFloorArea();
		System.out.println("Floor area of studyRoom is : " + studyFloorArea + " units ");
		
		int cost = studyRoom.calculateWallPaintingCost(2);
		System.out.println("Cost of painting studyRoom walls : Rs." + cost);
		
		Room diningRoom = new Room();
		diningRoom.length = 400;
		diningRoom.width = 200;
		diningRoom.height = 150;
		
		System.out.println("Floor area of diningRoom is : " + diningRoom.calculateFloorArea() + " units ");
		System.out.println("Cost of painting diningRoom walls : Rs." + diningRoom.calculateWallPaintingCost(3));
		
	}

}
