package ds.heap;

import java.util.ArrayList;

public class Heap {
	static final String MAX = "max";
	static final String MIN = "min";
	private ArrayList<Integer> arr = new ArrayList<>();
	private String option;
	private int size;
	private int MAX_SIZE = -1;

	Heap(String option) {
		this.option = option;
		this.size = 0;
	}
	
	Heap(String option, int max_size) {
		this(option);
		this.MAX_SIZE = max_size;
	}
	/**
	 * 
	 * @param arr
	 * @param n
	 * @param options - Max - max value will be root and in Min - Min value will be
	 *                the root element
	 */
	void heapify() {

		// i is the first non leaf node and can be found using formula - (n/2) -1;

		for (int i = (size / 2) - 1; i >= 0; i--) {
			int max = i;

			if ((2 * i) + 1 < size) {
				if (option.equals(MAX)) {
					if (arr.get(max) < arr.get((2 * i) + 1))
						max = (2 * i) + 1;
				} else {
					if (arr.get(max) > arr.get((2 * i) + 1))
						max = (2 * i) + 1;
				}
			}

			if ((2 * i) + 2 < size) {
				if (option.equals(MAX)) {
					if (arr.get(max) < arr.get((2 * i) + 2))
						max = (2 * i) + 2;
				} else {
					if (arr.get(max) > arr.get((2 * i) + 2))
						max = (2 * i) + 2;
				}
			}

			// Swap the current element (i) with max element
			if (i != max) {
				swap(i, max);
			}
		}

	}

	void addElement(int element) {
		if(MAX_SIZE != -1 && size == MAX_SIZE)
			this.removeElement(0);
		
		arr.add(element);
		size++;
		heapify();
	}

	int removeElement(int pos) {
		swap(pos, (size - 1));
		int removedElement = arr.remove((size - 1));
		size--;
		heapify();
		return removedElement;
	}

	int peek() {
		if (arr.isEmpty()) {
			return -1;
		}

		return arr.get(0);

	}

	void swap(int a, int b) {

		int temp = arr.get(b);
		arr.set(b, arr.get(a));
		arr.set(a, temp);

	}

	void print() {
		if (size == 0) {
			System.out.println("Heap is Empty");
			return;
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr.get(i) + " ~ ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 8, 0, 9, 32};
		
		System.out.println("Testing Max Heap Creation");
		Heap hp = new Heap(MAX);
		
		System.out.println("Peek : " + hp.peek());
		hp.print();
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Adding element :" + a[i]);
			hp.addElement(a[i]);
		}
		
		System.out.println("Peek : " + hp.peek());
		hp.print();

		for (int i = 0; i < a.length; i++) {
			System.out.println("Element removed: " + hp.removeElement(0));
		}

		System.out.println("Peek : " + hp.peek());
		hp.print();
		
		
		System.out.println("\nTesting Min Heap Creation");
		hp = new Heap(MIN);
		
		System.out.println("Peek : " + hp.peek());
		hp.print();
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Adding element :" + a[i]);
			hp.addElement(a[i]);
		}
		
		System.out.println("Peek : " + hp.peek());
		hp.print();

		for (int i = 0; i < a.length; i++) {
			System.out.println("Element removed: " + hp.removeElement(0));
		}

		System.out.println("Peek : " + hp.peek());
		hp.print();
	}

}
