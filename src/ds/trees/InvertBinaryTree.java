package ds.trees;

import ds.trees.TreeTraversals.Node;

public class InvertBinaryTree {
	

	
	Node mirror(Node n){
		if(null == n ) {
			return n;
		}
		
		Node left = mirror(n.left);
		Node right = mirror(n.right);
		
		n.right = left;
		n.left = right;
		
		return n;
		
	}

	
	public static void main(String[] args) {
		TreeTraversals t = new TreeTraversals();
		Node root = t.new Node(1);

		root.left = t.new Node(2);
		root.right = t.new Node(3);
		root.left.left = t.new Node(4);
		root.left.right = t.new Node(5);
		root.left.right.left = t.new Node(6);
		root.left.right.right = t.new Node(7);

		root.right.left = t.new Node(8);
		root.right.right = t.new Node(9);
		
		
		InvertBinaryTree i = new InvertBinaryTree();
		i.mirror(root);
		
		t.levelOrder(root);
		

	}

}
