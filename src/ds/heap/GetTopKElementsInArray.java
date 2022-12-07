package ds.heap;

import java.util.ArrayList;
import java.util.Arrays;

public class GetTopKElementsInArray {

	static int[] getTopKElements(ArrayList<Integer> a, int k) throws Exception {

		if (k <= 0 || k > a.size()) {
			throw new Exception("Please Enter valid Kth Element");
		}
		Heap heap = new Heap(Heap.MIN, k);

		int[] result = new int[k];

		for (int i = 0; i < a.size(); i++) {
			heap.addElement(a.get(i));
		}

		for (int i = k - 1; i >= 0; i--) {
			result[i] = heap.removeElement(0);
		}

		return result;

	}

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(11, -2, -8, 0, 19, 19, 0));
		 
		int k = 7;
		int[] res = getTopKElements(a, k);
		for (int i = 0 ;i<k ; i++) {
			System.out.print(res[i] + "~");
		}

	}

}
