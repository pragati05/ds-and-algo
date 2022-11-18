package ds.linkedlist.problems;

public class ReverseSLL {

	class Node {
		int data;
		Node next = null;
		
		Node(int d){
			this.data = d;
		}
		
	}
	
public static void main(String[] args) {
	ReverseSLL r = new ReverseSLL();
	Node head = r.new Node(1);
	head.next = r.new Node(2);
	head.next.next = r.new Node(3);
	head.next.next.next = r.new Node(4);
	head.next.next.next.next = null;
	
	printLL(head);
	head = reverseSLL(head);
	printLL(head);
}

static void printLL(Node head) {
	Node temp = head;
	while(temp!=null) {
		System.out.print(temp.data+"->");
		temp = temp.next;
	}
	System.out.println();
}
private static Node reverseSLL(Node head) {
	if(head == null) {
		return null;
	}
	Node left = null;
	Node curr = head;
	Node right = head.next;
	
	while(true) {
		curr.next = left;
		
		
		left = curr;
		curr = right;
		if(curr == null)
				break;
		right = right.next;
	}
	return left;
}
}
