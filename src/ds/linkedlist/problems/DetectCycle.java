package ds.linkedlist.problems;


public class DetectCycle {

	class Node {
		int data;
		Node next = null;
		boolean isVisited = false;
		
		Node(int d){
			this.data = d;
		}
		
	}

public static void main(String[] args) {
	DetectCycle d = new DetectCycle();
	Node head = d.new Node(1);
	head.next = d.new Node(2);
	head.next.next = d.new Node(3);
	head.next.next.next = d.new Node(4);
	head.next.next.next.next = null;
	
	System.out.println("Is Cycle deteded : " + isCyclic(head));
	
	head.next.next.next.next = head.next.next;
	
	System.out.println("Is Cycle deteded : " + isCyclic(head));
}

private static boolean isCyclic(Node head) {
	Node temp = head;
	if(head == null) {
		return false;
	}else if(head.next == null) {
		return true;
	}
	do {
		if(temp.next == null) {
			return false;
		}
		temp.isVisited = true;
		temp = temp.next;
	}
	while(!temp.isVisited);
	
	return true;
	
}
}
