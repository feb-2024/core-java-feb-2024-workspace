package arrays;

public class OneDArrayDemo {

	public static void main(String[] args) {
		// declare an array
		int[] myMarks = new int[5];
		
		// assign values to the array element
		myMarks[0] = 60;
		myMarks[1] = 70;
		myMarks[2] = 80;
		myMarks[3] = 40;
		myMarks[4] = 50;
		
		// traverse an array
		for(int i=0;i<myMarks.length;i++) {
			System.out.println(myMarks[i]);
		}
		System.out.println("-----------------");
		
		for(int eachMark: myMarks) {
			System.out.println(eachMark);
		}
		
		// initializing an array
		String[] allColors = {"red", "blue", "green"};
		
	}

}