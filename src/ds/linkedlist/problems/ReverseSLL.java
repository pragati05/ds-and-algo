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
	
	reverseSLL(head);
}

private static void reverseSLL(Node head) {
	
	Node prev = null;
	Node curr = head;
	Node next = head;
	
	while(next!=null) {
		prev = curr;
		curr = next;
		next = curr.next;
		curr.next = prev;
		
	}
	
	head = curr;
	Node temp = head;
	while(temp.next!=null) {
		System.out.println(temp.data + "->");
		temp = temp.next;
	}
}
}
