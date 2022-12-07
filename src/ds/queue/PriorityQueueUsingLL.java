package ds.queue;

import java.util.Arrays;
import java.util.*;

class Node {
	int data;
	int priority;
	Node next;

	Node(int data, int priority) {
		this.data = data;
		this.priority = priority;
	}
}

public class PriorityQueueUsingLL {
	Node HEAD = null;

	// Print Queue
	void print() {
		Node node = HEAD;
		while (node != null) {
			System.out.println(node.data + " ~ " + node.priority);
			node = node.next;
		}
	}

	// Return top element based on priority
	Node peek() {
		return HEAD;

	}

	// Insert item based on priority - Queue will be in ascending order based on
	// priority number
	int getPosition(int priority) {
		int pos = 1;
		Node temp = HEAD;

		if (HEAD == null || priority > HEAD.priority) {
			return pos;
		} while( temp != null && priority <= temp.priority) {
			pos++;
			temp = temp.next;
		}
		return pos;
	}

	void insertAtPos(int pos, Node node) {

		if (pos == 1) {
			node.next = HEAD;
			HEAD = node;
			return;

		}
		Node temp = HEAD;
		while (pos >2 &&  temp != null) {
			temp = temp.next;
			pos--;
		}

		node.next = temp.next;
		temp.next = node;

	}

	void enqueue(int data, int priority) {
		Node node = new Node(data, priority);
		if (HEAD == null) {
			HEAD = node;
			return;
		} else {
			int pos = getPosition(priority);
			insertAtPos(pos, node);
		}

	}

	// Delete Last node
	Node dequeue() {
		Node nodeRemoved = peek();
		HEAD = nodeRemoved.next;
		return nodeRemoved;

	}

	public static void main(String[] args) {

		PriorityQueueUsingLL pq = new PriorityQueueUsingLL();
		int[][] input = new int[][]{{1,2},
		                  {2,4},
		                  {3,6},
		                  {4,8}};
	                  
       for(int i = 0 ; i<input.length;i++) {
    	   for(int j = 0; j < input[0].length -1 ; j++) {
    		   pq.enqueue(input[i][j], input[i][j+1]);
    	  }
	    }
	

		pq.print();

		System.out.println("**********");
		System.out.println("Return Peek: " + pq.peek().data + " ~" + pq.peek().priority);
		
		System.out.println("********** dequeue 2 items");

		pq.dequeue();
		pq.dequeue();

		pq.print();
		
		System.out.println("********** add 1 element");

//		pq.enqueue(4, 7);
//		pq.enqueue(8, 7);
//		pq.enqueue(8, 9);
		pq.enqueue(8, 1);
		System.out.println("**********");
		pq.print();
		

	}

}
