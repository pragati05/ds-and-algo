package ds.trees;

import java.util.ArrayDeque;
import java.util.Deque;

import ds.trees.TreeTraversals.Node;

public class BFSUsingReccursion {

	static Deque<Node> q = new ArrayDeque<>();
	static boolean searchElement(Node n , int k) {
		
		if(n == null ) {
			return false;
		}
		
		if(n.data == k)
			return true;
		
		
		if(n.left != null)
			q.addFirst(n.left);
		
		if(n.right != null)
			q.addFirst(n.right);
		
		
		if(q.isEmpty())
			return false;
		
		if(searchElement(q.removeLast(), k))
			return true;
		
		return false;
		
	}
	public static void main(String[] args) {
		TreeTraversals t = new TreeTraversals();
		Node root = t.new Node(1);

		root.left = t.new Node(2);
		root.right = t.new Node(3);
		root.left.left = t.new Node(1);
		root.left.right = t.new Node(2);
		root.right.left = t.new Node(3);
		root.right.right = t.new Node(4);
		root.right.right.left = t.new Node(5);
		root.right.right.left.left = t.new Node(6);
		
		System.out.println("found: " + searchElement(root, 63));

	}

}
