package ds.linkedlist.problems;

public class SumOfNumberUsingLinkedList {

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

		return head;
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

	public static void main(String[] args) {
		SumOfNumberUsingLinkedList r = new SumOfNumberUsingLinkedList();

		
		Node n1 = r.convertNumberToLinkedList("1645873221456");
		Node n2 = r.convertNumberToLinkedList("90986953578998799");
		Node result = r.addNumbers(n1, n2);
		assert r.print(result) == r.print(r.convertNumberToLinkedList("90988599452220255"));
		System.out.println(r.print(result));
		
		n1 = r.convertNumberToLinkedList("1");
		n2 = r.convertNumberToLinkedList("5");
		result = r.addNumbers(n1, n2);
		assert r.print(result) == r.print(r.convertNumberToLinkedList("6"));
		System.out.println(r.print(result));
		
		n1 = r.convertNumberToLinkedList("9");
		n2 = r.convertNumberToLinkedList("9");
		result = r.addNumbers(n1, n2);
		assert r.print(result) == r.print(r.convertNumberToLinkedList("18"));
		System.out.println(r.print(result));
		
		n1 = r.convertNumberToLinkedList("0");
		n2 = r.convertNumberToLinkedList("0");
		result = r.addNumbers(n1, n2);
		assert r.print(result) == r.print(r.convertNumberToLinkedList("0"));
		System.out.println(r.print(result));
		
		n1 = r.convertNumberToLinkedList("11111");
		n2 = r.convertNumberToLinkedList("55");
		result = r.addNumbers(n1, n2);
		assert r.print(result) == r.print(r.convertNumberToLinkedList("11166"));
		System.out.println(r.print(result));
		
		n1 = r.convertNumberToLinkedList("25");
		n2 = r.convertNumberToLinkedList("100000");
		result = r.addNumbers(n1, n2);
		assert r.print(result) == r.print(r.convertNumberToLinkedList("100025"));
		System.out.println(r.print(result));
		
		System.out.println("All Test cases passed");
	}

}
