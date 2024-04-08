package classesandobjects;

public class Room {
	int length;
	int width;
	int height;
	String roomColor;
	int roomNumber;
	
	
	public Room(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public Room(int length, int width, int height, String roomColor) {
		this(length, width, height);
//		this.length = length;
//		this.width = width;
//		this.height = height;
		this.roomColor = roomColor;
	}
	
	public Room(int length, int width, int height, String roomColor, int roomNo) {
		this(length, width, height, roomColor);
		this.roomNumber = roomNumber;
	}
	
	int calculateFloorArea() {
		int floorArea = length * width;
		return floorArea;
	}
	
	int calculateWallPaintingCost(int paintingRate) {
		// first calculate the wall area
		int wallArea = calculateWallArea();
		// second calculate the painting cost
		int paintingCost = wallArea * paintingRate;
		return paintingCost;
	}
	
	int calculateWallArea() {
		int wallArea = (2 * height * (width + length));
		return wallArea;
	}
	
	
}
