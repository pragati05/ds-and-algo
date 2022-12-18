package ds.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapUsingPqueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		pq.add(4);
		pq.add(6);
		pq.add(5);
		pq.add(7);
		pq.add(10);
		pq.add(8);
		
		System.out.println(pq);
		
		System.out.println("Max num: " + pq.peek());
		
		System.out.println("Remove head: " + pq.poll());
		
		System.out.println(pq.remove(10));

		
		System.out.println(pq);

	}

}
