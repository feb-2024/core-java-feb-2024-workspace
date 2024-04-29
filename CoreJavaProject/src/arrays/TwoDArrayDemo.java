package arrays;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// declare the array
		int[][] matrixA = new int[3][2];
		
		// assigning values to the elements
		matrixA[0][0] = 3;
		matrixA[0][1] = 6;
		matrixA[1][0] = 4;
		matrixA[1][1] = 8;
		matrixA[2][0] = 7;
		matrixA[2][1] = 9;

		// traversing the array
		for(int i=0;i<matrixA.length;i++) {
			for(int j=0;j<matrixA[i].length;j++) {
				System.out.print(matrixA[i][j] + "    ");
			}
			System.out.println();
		}
		
		System.out.println("------------");
		for(int[] oneDA : matrixA){
		   for(int eachElement : oneDA){
		      System.out.print(eachElement + "     ");
		   }
		   System.out.println();
		}
		System.out.println("------------");
		//initializing a 2d array
		int[][] matrixB = {{5,2},{7,3},{8,4}};
		
		// questions
		// can i do this and what does oneD hold?
		int[] oneD = matrixB[1];
		for(int eachOne: oneD) {
			System.out.println(eachOne);
		}
		
		// what does this mean and how is this possible?
		Object obj = matrixB;
		System.out.println(obj);
		
	}

}
