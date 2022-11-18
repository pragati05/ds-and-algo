package ds.linkedlist.problems;

import ds.linkedlist.problems.ReverseSLL.Node;

public class CountNodesInCycle {
	class Node {
		int data;
		Node next = null;
		
		Node(int d){
			this.data = d;
		}
		
	}


	
	public static void main(String[] args) {
		
		Node head = new CountNodesInCycle().new Node(1);
		head.next = new CountNodesInCycle().new Node(2);
		head.next.next = new CountNodesInCycle().new Node(3);
		head.next.next.next = new CountNodesInCycle().new Node(4);
		head.next.next.next.next = head.next;
		System.out.println("Nodes in Cycle: "+findNodes(head));
		
	}



	private static int findNodes(Node head) {
		Node fast = head;
		Node slow = head;
		int count = 0;
		
		do{
			System.out.println("fast: "+fast.data +" , slow: "+slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}while(fast!=slow); 
		System.out.println("fast: "+fast.data +" , slow: "+slow.data);
		
		if(fast == slow) {
			
			do {
				slow = slow.next;
				count++;
			}while(fast!=slow);
		}
		return count;
	}

}
