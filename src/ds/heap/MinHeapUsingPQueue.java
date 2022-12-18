package ds.heap;

import java.util.PriorityQueue;

public class MinHeapUsingPQueue {

	public static void main(String[] args) {


		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(4);
		pq.add(6);
		pq.add(5);
		pq.add(7);
		pq.add(10);
		pq.add(8);
		
		System.out.println(pq);
		
		System.out.println("Min num: " + pq.peek());
		
		System.out.println("Remove head: " + pq.poll());
		
		pq.remove(10);
		
		System.out.println(pq);
	}

}
