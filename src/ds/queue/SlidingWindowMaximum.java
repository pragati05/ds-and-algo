package ds.queue;

import java.util.*;
import ds.queue.DeQueLL;

public class SlidingWindowMaximum {

	public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) throws Exception {

		//ArrayDeque<Integer> deque = new ArrayDeque<>();
		DeQueLL<Integer> deque = new DeQueLL<>();
		ArrayList<Integer> res = new ArrayList<>();
		System.out.println("Input: "+ A.toString());
		for (int i = 0; i < A.size(); i++) {
			
			int windowStart =  i-B+1;
			
			while (!deque.isEmpty() && A.get(deque.peekLast() ) < A.get(i))
				deque.removeLast();
			
			if ( !deque.isEmpty() &&  deque.peekFirst() < windowStart)
				deque.removeFirst();

			deque.addLast(i);
			
			if(i >= B-1)
				res.add(A.get(deque.peekFirst()));
			
			
			System.out.println("Pass: "+ i + " -> " + deque.toString() );
			deque.print();
			System.out.println();
			System.out.println("\n Res: "+ res.toString());
			
			
		}
		
		return res;
	}

	public static void main(String[] args) throws Exception {

		SlidingWindowMaximum sw = new SlidingWindowMaximum();

		List<Integer> A = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 10, 8, 7, 9, 8);

		A = sw.slidingMaximum(A, 3);
		System.out.println(A.toString());
		// [10, 9, 8, 7, 6, 5, 4, 10, 10, 10, 9, 9]
		// [10, 9, 8, 7, 6, 5, 4, 10, 10, 10, 9, 9]
		// [10, 9, 8, 7, 6, 5, 4, 10, 10, 10, 9, 9]

	}

}
