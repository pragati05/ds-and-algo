package ds.heap;

import java.util.ArrayList;
import java.util.Arrays;

public class KthLargestElementInArray {

	static int findKthLargestELement(ArrayList<Integer> a , int k) throws Exception {
		
		if(k <= 0 ||  k>a.size()) {
			throw new Exception("Please Enter valid Kth Element");
		}
		Heap heap = new Heap(Heap.MIN, k);
		
		
		
		for(int i = 0 ; i < a.size(); i++) {
			heap.addElement(a.get(i));
		}
		
		
		return heap.peek();
		
	}
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(11, -2, -8, 0, 19, 19, 0));
		int k = 8;
		System.out.println(k + "th Largest Elemet " + findKthLargestELement(a, k));
		

	}

}
