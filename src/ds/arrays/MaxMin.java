package ds.arrays;

import java.util.*;

/**
 * A = [-2, 1, -4, 5, 3] = 1 A = [1, 3, 4, 1] = 5
 * 
 * @author pragati
 *
 */
public class MaxMin {

	
	public int solve(ArrayList<Integer> A) {
		int min = A.get(0);
		int max = A.get(0);

		for(int i = 1 ; i <A.size(); i++){
				if(A.get(i) > max){
					max = A.get(i);
				}else if(A.get(i) < min){
					min = A.get(i);
				}
		}

		return max+min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMin maxMinSum = new MaxMin();
		int res =  maxMinSum.solve(new ArrayList<>(Arrays.asList(-2,1,-4,5,3)));
		System.out.println(res);

	}

}
