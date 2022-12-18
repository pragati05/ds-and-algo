package ds.trees;

import ds.trees.TreeTraversals.Node;

public class SumOfTree {
	
	static int sumOfNodes(Node node) {
		if(node == null) {
			return 0;
		}
		return  node.data  + sumOfNodes(node.left) + sumOfNodes(node.right);
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

		
		int res = sumOfNodes(root);
		System.out.println(res);

	}

}
