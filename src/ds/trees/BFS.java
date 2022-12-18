package ds.trees;


import ds.trees.TreeTraversals.Node;
import java.util.*;

public class BFS {
	
	
	static Deque<Node> q = new ArrayDeque<>();
	
	static boolean searchElement(Node n , int k ){
		
		Node t = null;
		
		if(n == null) {
			return false;
		}
		
		q.addFirst(n);
		
		while(!q.isEmpty()) {
			t = q.removeLast();

			if(t.data == k) {
				return true;
			}
			
			
			if(t.left != null)
				q.addFirst(t.left);
			
			if(t.right != null)
				q.addFirst(t.right);
			
		}
		
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
		
		System.out.println("found: " + searchElement(root, 0));

	}

}
