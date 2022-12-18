package ds.trees;

import ds.trees.TreeTraversals.Node;

public class SumOfTreeWithLevelFactor {
	
	static int sumOfNodes(Node node, int level) {
		if(node == null) {
			return 0;
		}
		return  (node.data  * level*10) + sumOfNodes(node.left,level+1) + sumOfNodes(node.right,level+1);
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

		
		
		int res = sumOfNodes(root, 1);
		System.out.println(res);

	}

}
