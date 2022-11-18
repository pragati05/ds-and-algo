package ds.linkedlist.problems;

public class ReverseDLL {
	
	class Node {
		int data;
		Node next = null;
		Node prev = null;
		
		Node(int d){
			this.data = d;
		}
		
	}
public static void main(String[] args) {

	ReverseDLL r = new ReverseDLL();
	Node head = r.new Node(1);
	
	head.next = r.new Node(2);
	head.next.prev = head;
	
	head.next.next = r.new Node(3);
	head.next.next.prev = head.next;
	
	head.next.next.next = r.new Node(4);
	head.next.next.next.prev = head.next.next;
	
	head.next.next.next.next = null;
	
	print(head);
	head = reverseDLL(head);
	print(head);

}

private static Node reverseDLL(Node head) {
	Node temp = head;
	
	while(true) {
		swapNode(temp);
		
		if(temp.prev == null) {
			System.out.println("Temp: "+temp);
			return temp;
		}
		temp = temp.prev;
		
	}
}

public static void print(Node head) {
	System.out.println("\n**** Printing DLL *** ");
	if(head==null) {
		System.out.println("Empty");
		return;
	}
	Node temp = head;
	Node tail = head;
	while(true) {
		System.out.print(temp.data + "->");
		if(temp.next == null) {
			tail = temp;
			break;
		}
		temp = temp.next;
		
	}
	
	System.out.println();
	temp = tail;
	while(temp!=null) {
		System.out.print( "<-"+ temp.data );
		temp = temp.prev;
	}
	
	System.out.println("\nHEAD: "+head.data+" TAIL: "+tail.data);
	System.out.println("*********************************");

}

static void swapNode(Node temp){
	Node c = temp.prev;
	temp.prev = temp.next;
	temp.next = c;
}

}
