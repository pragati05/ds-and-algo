package ds.trees;

import ds.trees.TreeTraversals.Node;

public class HeightOfTree {
	
	public static int height(Node root) {
		Node temp = root;
		if(temp == null) {
			return -1;
		}
		
		return Math.max(height(temp.right), height(temp.left))+1;
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
		
		System.out.println(height(root));

	}

}
