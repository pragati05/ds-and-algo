package ds.trees;

import java.util.ArrayList;

// Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  
public class SymmetricTree {
	
	
	 public boolean isSymmetric(TreeNode root) {
	        TreeNode temp = root;
	        return isValueSame(temp.left, temp.right);
	        
	    }
	     public boolean isValueSame(TreeNode left , TreeNode right){
	        if(left == null || right ==  null){
	            return left == right;
	        }
	        
	        if(left != right) {
	        	return false;
	        }
	         return isValueSame(left.left, right.right) && isValueSame(left.right , right.left); 
	     }
	     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
