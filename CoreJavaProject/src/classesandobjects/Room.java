package classesandobjects;

import java.util.Objects;

public class Room {
	private int length;
	private int width;
	private int height;
	private String roomColor;
	private int roomNumber;
	
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
	
	// provide getters and setters fro the private data members
	//getter
	public int getLength() {
		return length;
	}
	//setter
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getRoomColor() {
		return roomColor;
	}

	public void setRoomColor(String roomColor) {
		this.roomColor = roomColor;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
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

	@Override
	public int hashCode() {
		return Objects.hash(height, length, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return height == other.height && length == other.length && width == other.width;
	}

	@Override
	public String toString() {
		return "Room [length=" + length + ", width=" + width + ", height=" + height + ", roomColor=" + roomColor
				+ ", roomNumber=" + roomNumber + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// finalize method acts like the destructor
		// here we can release the system resources that were occupied in the constructor
		// for testing let us give a sop
		System.out.println("in finalize()");
	}

	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		// here we are going to redefine the equals() of Object and perform content equality
//		Room other = (Room)obj;
//		if(other == null) {
//			return false;
//		} else if (this.length == other.length && this.width == other.width && this.height == other.height) {
//			return true;
//		}
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return (length+width+height);
//	}
	
}
