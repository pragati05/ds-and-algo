package ds.linkedlist.problems;

import ds.linkedlist.problems.ReverseSLL.Node;

public class DeletNthNodeFromLast {

	class Node {
		int data;
		Node next = null;

		Node(int d) {
			this.data = d;
		}

	}

	static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;

		}
	}

	static void deleteHead(Node head) {
		
		head = head.next;
		print(head);
	}
	
	static void deleteLastNode(Node head) {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		print(head);
	}
	static void deleteNNode(int pos, Node head) {
		Node temp = head;
		if(pos == 0) {
			deleteHead(head);
			
		}else if(pos == getSize(head) ) {
			deleteLastNode(temp);
		}else{ 
			while(pos>1 ) {
				temp = temp.next;
				pos--;
			}
			System.out.println("Temp: "+ temp.data);
			temp.next = temp.next.next;
			print(head);
			
		}
	
		
	}

	static int getSize(Node head) {
		int count = -1;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		DeletNthNodeFromLast r = new DeletNthNodeFromLast();
		Node head = r.new Node(1);
		head.next = r.new Node(2);
		head.next.next = r.new Node(3);
		head.next.next.next = r.new Node(4);
		head.next.next.next.next = null;

		print(head);
		System.out.println("\nSize: " + getSize(head));
		int nodeDeletedFromEnd = 2;

		int nodeDeletedFromStart = (getSize(head) - nodeDeletedFromEnd);
		
		System.out.println("nodeDeletedFromStart: " + nodeDeletedFromStart);
		
		deleteNNode(nodeDeletedFromStart,head);
		
		
	}

}
