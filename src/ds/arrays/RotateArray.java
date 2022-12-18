package ds.arrays;

import java.util.ArrayList;
/**
 * Explanation 1:

 After rotating the matrix by 90 degree:
 1 goes to 2, 2 goes to 4
 4 goes to 3, 3 goes to 1
 
 * @author pragati
 *
 */
public class RotateArray {

	public void rotate(ArrayList<ArrayList<Integer>> a) {
		
		// Transpose matrix: row become colum and vice versa
		int n = a.size();
		
		for(int i = 0 ; i<n; i++ ) {
			for(int j = 0 ; j < i ; j++) {
				swap(a,i,j,j,i);
			}
		}
		
		
		// reverse each row
		int left = 0 ;
		int right = n-1;
		while(left < right) {
			for(int i = 0 ; i < n; i++) {
				swap(a,i,left,i,right);
			}
			left++;
			right--;
			
		}
	}

	void swap(ArrayList<ArrayList<Integer>> a, int x1, int y1, int x2, int y2) {
		int temp = a.get(x1).get(y1);
		a.get(x1).set(y1, a.get(x2).get(y2));
		a.get(x2).set(y2, temp);
	}

	public static void main(String[] args) {

	}

}
