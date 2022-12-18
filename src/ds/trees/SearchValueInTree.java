package ds.trees;

import ds.trees.TreeTraversals.Node;

public class SearchValueInTree {
	
	
	static boolean dfs(Node n, int k) {
		if(n == null) {
			return false;
		}
		
		
		if(dfs(n.left , k)) {
			return true;
		}
		
		if(dfs(n.right, k)) {
			return true;
		}
		
		if(n.data == k) {
			return true;
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

		
		System.out.println("is Presesnt: " + dfs(root, 0));
	}

}
