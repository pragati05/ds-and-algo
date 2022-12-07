package ds.heap;

import java.util.ArrayList;
import java.util.Arrays;

public class HeapSort {
	static ArrayList<Integer>  heapSort(ArrayList<Integer> arr, boolean desc ){
		Heap hp = null;
		ArrayList<Integer> result = new ArrayList<>();
		if(desc) 
			 hp = new Heap(Heap.MAX);
		else 
			 hp = new Heap(Heap.MIN);
		
		for(int i = 0 ; i < arr.size(); i++) {
			hp.addElement(arr.get(i));
		}
		
		for(int i = 0 ; i < arr.size(); i++) {
			result.add(hp.removeElement(0));
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(11, -2, -8, 0, 19, 19, 0));
		ArrayList<Integer>  res = heapSort(a, true);
		System.out.println(res);
		
		a = new ArrayList<>(Arrays.asList());
		res = heapSort(a, true);
		System.out.println(res);
	}
}
