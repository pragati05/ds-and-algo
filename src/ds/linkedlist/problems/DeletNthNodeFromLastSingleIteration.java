package ds.linkedlist.problems;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DeletNthNodeFromLastSingleIteration {
	
	class Node {
		int data;
		Node next = null;

		Node(int d) {
			this.data = d;
		}

	}
	
	static String print(Node head) {
		StringBuffer sb = new StringBuffer();
		Node temp = head;
		while (temp != null) {
			sb.append(temp.data).append("->");
			System.out.print(temp.data + "->");
			temp = temp.next;

		}
		
		return sb.toString();
	}
	
	static Node deleteHead(Node head) {
		Node temp = head;
		head = head.next;
		temp.next = null;
		return head;
	}
	
	static Node deleteLastNode(Node head) {
		
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
		
	}
	
	static Node deleteNLastNode(Node head, int pos) {
		Node slow = head;
		Node fast = head;
		
		if(pos<=0 || head == null ) {
			return null;
		}
		if(pos == 1) {
			return deleteLastNode(head);
		}
		while(pos > 0 ) {
			fast = fast.next;
			if(fast==null) {
				return null;
			}
			pos--;
		}
		while(fast.next!=null) {
			fast = fast.next;
			slow = slow.next;
		}
		
		if(slow == head) {
			return deleteHead(head);
			 
		}
		
		slow.next = slow.next.next;
		return head;
		
	}
	
	
	
	public static void main(String[] args) {
		
		DeletNthNodeFromLastSingleIteration r = new DeletNthNodeFromLastSingleIteration();
		Node head = r.new Node(1);
		head.next = r.new Node(2);
		head.next.next = r.new Node(3);
		head.next.next.next = r.new Node(4);
		head.next.next.next.next = null;
		
		// If LL head is null
		assertEquals("",print(deleteNLastNode(null,3)));
		System.out.println();
		
		// Delete Last Node
		assertEquals("1->2->3->", print(deleteNLastNode(head,1)));
		
		System.out.println();
		// If Node is head it self
		assertEquals("2->3->",print(deleteNLastNode(head,2)));
				
		System.out.println();
		
		// if Node doesnt exist
	assertNull(deleteNLastNode(head,5));
		
		
		
	


	}

}
