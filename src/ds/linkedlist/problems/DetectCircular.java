package ds.linkedlist.problems;

public class DetectCircular {

	class Node {
		int data;
		Node next = null;
		
		Node(int d){
			this.data = d;
		}
		
	}
	
public static void main(String[] args) {
	DetectCircular d = new DetectCircular();
	Node head = d.new Node(1);
	head.next = d.new Node(2);
	head.next.next = d.new Node(3);
	head.next.next.next = d.new Node(4);
	head.next.next.next.next = head;
	
	System.out.println("is Circular: "+ isCircular(head));
	
	head = d.new Node(1);
	head.next = d.new Node(2);
	head.next.next = d.new Node(3);
	
	System.out.println("is Circular: "+ isCircular(head));
}

private static boolean isCircular(Node head) {
	
	if(head == null) {
		System.out.println("Empty List");
		return false;
	}else if(head.next == head) {
		return true;
	}else {
		Node temp = head;
		do {
			if(temp.next == null) {
				return false;
			}
			temp = temp.next;
		}while(temp != head);
	}
	return true;
}
}
