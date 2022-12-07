package ds.arrays;

import java.util.ArrayList;

import ds.linkedlist.problems.SumOfNumberUsingLinkedList;
import ds.linkedlist.problems.SumOfNumberUsingLinkedList.Node;

import java.util.*;

/**
 * Input = [1, 2, 3]; Output = [1, 2, 4]
 * 
 * @author pragati
 *
 */
public class AddOneToNumberUsingLL {
	class Node {
		int data;
		Node next = null;

		Node(int d) {
			this.data = d;
		}

	}

	Node convertNumberToLinkedList(String num) {
		Node head  = null;
		for(int i = 0;i<num.length();i++) {
			head = insertNewNodeInResult(Integer.parseInt(num.charAt(i) + ""), head);
		}
		
		return head;
	}
	// Print Node
	String print(Node head) {
		StringBuffer sb = new StringBuffer();
		Node temp = head;
		while (temp != null) {
			sb.append(temp.data);   //.append("->");
			// System.out.print(temp.data + "->");
			temp = temp.next;
		}

		return sb.toString();
	}

	// Find length of linked list
	int getSize(Node head) {
		int size = 0;
		Node temp = head;
		while (temp.next != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	// Reverse Linked list
	Node reverseLL(Node head) {

		if (head == null) {
			return null;
		}
		Node left = null;
		Node curr = head;
		Node right = head.next;

		while (true) {
			curr.next = left;

			left = curr;
			curr = right;
			if (curr == null)
				break;
			right = right.next;
		}
		head = left;
		return head;
	}

	Node insertNewNodeInResult(int data, Node head) {

		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
		}

		
	}

	// summ of 2 linked list
	Node addNumbers(Node head1, Node head2) {

		
		System.out.println("Original head1 = " + print(head1));
		System.out.println("Original head2 = " + print(head2));

//		System.out.println("\nAfter reverse - ");
		
		head1 = reverseLL(head1);
		head2 = reverseLL(head2);

	
		
		int head1Size = getSize(head1);
		int head2Size = getSize(head2);

		int pos = Math.abs(head2Size - head1Size);

		if (head1Size > head2Size) {
			head2 = addTrailingZero(head2, pos);
		} else if (head2Size > head1Size) {
			head1 = addTrailingZero(head1, pos);
		}
		
//		System.out.println(print(head1));
//		System.out.println(print(head2));
		
		
		SumOfNumberUsingLinkedList s = new SumOfNumberUsingLinkedList();

		Node res_head = null;
		int carry = 0;
		int sum = 0;

		while (head1 != null) {
			sum = head1.data + head2.data + carry;
//			System.out.println("Adding : "+ head1.data + "+ " + head2.data + "+" + carry);
			
			if (sum <= 9)
				carry = 0;
			else
				carry = 1;
			
			res_head = insertNewNodeInResult(sum % 10, res_head);
			print(res_head);
			head1 = head1.next;
			head2 = head2.next;

		}
		if (carry == 1) {
			res_head = insertNewNodeInResult(1, res_head);
		}
//		System.out.println(print(head1));
//		System.out.println(print(head2));

		// System.out.println("\n After sum: "+ print(res));
		return reverseLL(res_head);
	}

	// add trailing zero to small linked list
	Node addTrailingZero(Node head, int pos) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}

		while (pos > 0) {
			temp.next = new SumOfNumberUsingLinkedList().new Node(0);
			temp = temp.next;
			pos--;
		}
		return head;
	}
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		
		List<Integer> ll = new LinkedList<>(A);
		List<Integer> oneNumberList = new LinkedList<>(Arrays.asList(1));
		
		ll.
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
