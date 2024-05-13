package collections;

import java.util.Objects;

public class Room implements Comparable<Room>{
	private int length;
	private int height;
	private int width;
	
	public Room(int length, int height, int width) {
		super();
		this.length = length;
		this.height = height;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
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
		return "Room [length=" + length + ", height=" + height + ", width=" + width + "]";
	}

	@Override
	public int compareTo(Room o) {
		int perimeter1 = 2 * (this.length + this.width);
		int perimeter2 = 2 * (o.length + o.width);
		return (perimeter1 - perimeter2);
	}
	
}
