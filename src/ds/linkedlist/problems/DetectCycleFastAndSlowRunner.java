package ds.linkedlist.problems;

public class DetectCycleFastAndSlowRunner {

	class Node {
		int data;
		Node next = null;
		
		Node(int d){
			this.data = d;
		}
		
	}
	
public static void main(String[] args) {
	DetectCycleFastAndSlowRunner d = new DetectCycleFastAndSlowRunner();
	Node head = d.new Node(1);
	head.next = d.new Node(2);
	head.next.next = d.new Node(3);
	head.next.next.next = d.new Node(4);
	head.next.next.next.next = head.next.next;
	
	System.out.println("Is Cycle deteded : " + isCyclic(head));
	head.next.next.next.next = null;
	System.out.println("Is Cycle deteded : " + isCyclic(head));
}

private static boolean isCyclic(Node head) {
	if(head == null) {
		return false;
	}else if(head.next == null) {
		return true;
	}
	Node fast = head;
	Node slow = head;
	do {

		fast = fast.next.next;
		slow = slow.next;
		
		
		if(fast == null || slow== null) {
			return false;
		}
		
		if(fast == slow) {
			return true;
		}
	}
	while(fast!=slow);
	
	return false;
	
}
}
