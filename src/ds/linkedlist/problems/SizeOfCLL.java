package ds.linkedlist.problems;

class Node {
	int data;
	Node next = null;
	
	Node(int d){
		this.data = d;
	}
	
}

public class SizeOfCLL {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head;
		
		System.out.println(getSize(head));
		
		head = null;
		
		System.out.println(getSize(head));
		
		head = new Node(1);
		head.next = head;
		
		System.out.println(getSize(head));
		
	}

	private static int getSize(Node head) {
		int size = 0;
		if(head == null) {
			return 0;
		}
		Node temp = head;
		do {
			size++;
			temp = temp.next;
			
		}while(temp!=head);
		
		return size;
	}
}


