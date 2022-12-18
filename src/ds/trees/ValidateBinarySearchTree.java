package ds.trees;

import ds.trees.TreeTraversals.Node;

public class ValidateBinarySearchTree {

	
	static public boolean isValidBST(Node root) {
		boolean left ;
		boolean right;
		if(root == null ) {
			return true;
		}
		
	
		
		if((root.left != null  && root.left.data >= root.data)  ) 
			return false;
			
		if((root.right != null && root.right.data <= root.data)) 
			return false;
		
		left =  isValidBST(root.left);
		right =  isValidBST(root.right);
		
		return left && right;
		
		
        
    }
	public static void main(String[] args) {
		TreeTraversals t = new TreeTraversals();
		Node root = t.new Node(2);

		root.left = t.new Node(2);
		root.right = t.new Node(2);
//		root.right.left = t.new Node(6);
//		root.right.right = t.new Node(8);
		
		System.out.println(isValidBST(root));

	}

}
