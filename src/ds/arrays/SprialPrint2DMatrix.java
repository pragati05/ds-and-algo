package ds.arrays;

/**
 * Given a 2D array, print it in spiral form.
 * 
 * Examples:
 * 
 * Input: {
 * 			{1, 2, 3, 4}, 
 * 			{5, 6, 7, 8}, 
 * 			{9, 10, 11, 12}, 
 * 			{13, 14, 15, 16 }
 * 		  }
 * Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 Explanation: The output is
 * matrix in spiral format.
 * 
 * @author pragati
 *
 */
public class SprialPrint2DMatrix {
	static int row;
	static int col;

	static void matrixBorder(int[][] arr, int incr) {
		System.out.println("\nIncrement: "+incr);
//		if ((row-incr)  == (col-incr)) {
//			System.out.print(arr[incr][incr] + "->");
//			return;
//		}
		// ->
		for(int j = incr; j < col-incr; j++) {
			System.out.print(arr[incr][j] + "->");
		}
		
		// down
		for(int i = incr; i < row - incr ;i++) {
			System.out.print(arr[i][col - incr] + "->");
		}
		
		// <-
		for(int j = col - incr; j > incr ; j--) {
			System.out.print(arr[row - incr][j] + "->");
		}
		
		// Up
		for(int i = row - incr; i > incr ; i--) {
			System.out.print(arr[i][incr] + "->");
		}
		//matrixBorder(arr,incr++);
		System.out.println();
	}
	public static void main(String[] args) {
//		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		
//	int[][] arr = { 
//				{ 1, 2, 3, 4, 21}, 
//				{ 5, 6, 7, 8, 22}, 
//				{ 9, 10, 11, 12, 23}, 
//				{ 13, 14, 15, 16, 24}, 
//				{ 17, 18, 19, 20, 25} 
//		};
//		int[][] arr = { {1} };
	
	int[][] arr = {
			{1,2,3},
			{5,6,7},
			{9,10,11},
			{13,14,15},
			{17,18,19}
			
	};
		
		row = arr.length - 1;
		col = arr[0].length - 1 ;
		System.out.println("\n\nrow:" + row + ", col:" + col);
		
		int incr = 0;
		int limit = (col+1)/2  + (col+1)%2;
		System.out.println("Limit: "+limit);
		while(limit >0) {
			matrixBorder(arr,incr);
			limit--;
			incr++;
		}
	
		
		
		
	}

}
