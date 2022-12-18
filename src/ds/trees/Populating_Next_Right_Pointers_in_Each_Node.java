package ds.trees;

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
};

public class Populating_Next_Right_Pointers_in_Each_Node {

	public Node connect(Node root) {
		if (root == null)
			return root;

		root.next = null;
		helper(root);

		return root;
	}

	public Node helper(Node temp) {

		if(temp == null || temp.left == null || temp.right == null)
			return temp;
		
//		temp.left.next = temp.right;
//		
//		helper(temp.left);
//		helper(temp.right);
		
		
		
		
		
		Node left = helper(temp.left);
		Node right = helper(temp.right);
		left.right.next = right.left;
	}

	public static void main(String[] args) {
		Node root = new Node(1 , new Node(2), new Node(3), null);
		Populating_Next_Right_Pointers_in_Each_Node p = new Populating_Next_Right_Pointers_in_Each_Node();
		p.connect(root);

	}

}
