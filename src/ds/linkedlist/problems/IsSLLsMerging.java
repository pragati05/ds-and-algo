package ds.linkedlist.problems;

import ds.linkedlist.problems.ReverseSLL.Node;

public class IsSLLsMerging {
	class Node {
		int data;
		Node next = null;
		
		Node(int d){
			this.data = d;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "[" + data + "]";
		}
	}
	
	public static void main(String[] args) {
		
		IsSLLsMerging r = new IsSLLsMerging();
		Node head1 = r.new Node(4);
		head1.next = r.new Node(5);
		
		Node head2 = r.new Node(1);
		head2.next = r.new Node(2);
		head2.next.next = r.new Node(3);
		
		head1.next.next = r.new Node(6);
		head2.next.next.next = head1.next.next;
		
		head1.next.next.next = r.new Node(7);
		head1.next.next.next.next = r.new Node(8);	
		head1.next.next.next.next.next = null;
		
		System.out.println("Length of List1: "+getLength(head1));
		System.out.println("Length of List2: "+getLength(head2));
		
		int diff = Math.abs(getLength(head1) - getLength(head2));
		
		if(getLength(head1) > getLength(head2)) {
			head1 = head1.next;
		}else {
			head2 = head2.next;
		}
		
		Node temp1 = head1;
		Node temp2 = head2;
		
		while(temp1!=null || temp2!=null) {
			temp1 = temp1.next;
			temp2 = temp2.next;
			if(temp1 == temp2) {
				System.out.println("Merging Point: "+ temp1);
				break;
			}
		}
		System.out.println(head1 +  ": "+ head2);
		
	}
	
	public static int getLength(Node head) {
		int legnth = 0;
		Node temp = head;
		while(temp!=null) {
			legnth++;
			temp = temp.next;
		}
		return legnth;
	}
}
