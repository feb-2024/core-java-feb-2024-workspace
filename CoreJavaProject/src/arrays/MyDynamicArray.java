package arrays;

public class MyDynamicArray {
	private int[] myArray;
	private int size;
	private int capacity;
	
	public MyDynamicArray() {
		size = 0;
		capacity = 5;
		myArray = new int[capacity];
	}
	
	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	private boolean isFull() {
		return (capacity == size);
	}
	
	public void add(int item) {
		// if capacity == size then grow the array
		if(isFull()) {
			capacity += 5;
			int[] bigArray = new int[capacity];
			System.arraycopy(myArray, 0, bigArray, 0, myArray.length);
			myArray = bigArray;
		}
		// assign the item to the index of size
		myArray[size++] = item;
	}
	
	public void remove(int item) {
		// find the item in the array and set it to 0
		// shift the elements to the left
		// shrink the array if there are 5 empty spaces meaning size+5 == capacity
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[");
		for(int i=0;i<size;i++) {
			sb.append(myArray[i] + ((i==size-1)?"":", "));
		}
		sb.append("]");
		return sb.toString();
	}
	
	
}