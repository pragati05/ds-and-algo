package ds.linkedlist.problems;

import java.util.*;

public class SlidingWindowMaximum {

	public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {


	 	ArrayList<Integer> c = new ArrayList<Integer>();
	 	boolean isLastNumVisisted = false;
	 	for(int i = 0; i < A.size(); i++){
	 		
	 		int maxNumber = A.get(i);
            
	 		for(int j = i+1; j < (i+B); j++){
	 			
	 			if(A.get(j) > maxNumber){
		 			maxNumber = A.get(j);
		 		}
	 			
	 			if(j == (A.size()-1)) {
	 				isLastNumVisisted = true;
	 			}
	 		}

	 		c.add(maxNumber);
	 		if(isLastNumVisisted) {
	 			return c;
	 		}
	 	}
	 	return c;
	 
    }
 

	int findMaxNumber(ArrayList<Integer> temp) {
		int maxNumber = temp.get(0);

		for (int i = 1; i < temp.size(); i++) {
			if (temp.get(i) > maxNumber) {
				maxNumber = temp.get(i);
			}
		}
		return maxNumber;
	}

	public static void main(String[] args) {

		SlidingWindowMaximum sw = new SlidingWindowMaximum();

		List<Integer> A = new ArrayList<>();

		A.add(1);
		A.add(3);
		A.add(-1);
		A.add(-3);
		A.add(5);
		A.add(3);
		A.add(6);
		A.add(7);

		A = sw.slidingMaximum(A, 3);
		System.out.println(A.toString());

	}

}
