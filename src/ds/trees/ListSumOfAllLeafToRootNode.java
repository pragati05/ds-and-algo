package ds.trees;

import java.util.ArrayList;

import ds.trees.TreeTraversals.Node;

public class ListSumOfAllLeafToRootNode {

	void  traverseLeafToRoot(Node n, int val, ArrayList<Integer> arr ) {
		
		if(n == null) {
			return;
		}
		
		val = val * 10 + n.data;
		if (n.left == null && n.right == null) {
			arr.add(val);
			return;
		}
		
		traverseLeafToRoot(n.left , val, arr);
		traverseLeafToRoot(n.right, val, arr);
	}
	
	

	public static void main(String[] args) {
		TreeTraversals t = new TreeTraversals();
		Node root = t.new Node(1);

		root.left = t.new Node(2);
		root.right = t.new Node(3);
		root.left.left = t.new Node(4);
		root.left.right = t.new Node(5);
		root.left.left.left = t.new Node(6);
		root.left.left.right = t.new Node(7);

		
		ListSumOfAllLeafToRootNode obj = new ListSumOfAllLeafToRootNode();
		ArrayList<Integer> sumList  = new ArrayList<Integer>();
		obj.traverseLeafToRoot(root, 0, sumList);
		System.out.println(sumList);

	}

}
