package ds.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import ds.trees.TreeTraversals.Node;

/**
 * Input: root = [3,9,20,null,null,15,7] Output: [[3],[9,20],[15,7]]
 * 
 * @author pragati
 * 
 **/
public class Binary_Tree_Level_Order_Traversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	 public List<List<Integer>> levelOrder(TreeNode root) {
		 
		 List<List<Integer>> result = new ArrayList<>();
		 
		 Queue<TreeNode> currLevel = new ArrayDeque<>();
		 
		 if(root == null) {
			 return result;
		 }
		 currLevel.add(root);

		 
		 while(!currLevel.isEmpty()) {
			 
			 List<Integer> row = new ArrayList<>();
			 
			 Queue<TreeNode> nextLevel = new ArrayDeque<>();
			 
			 while(!currLevel.isEmpty()) {
				 TreeNode n = currLevel.poll();
				 row.add(n.val);
				 
				 if(n.left != null)
					 nextLevel.add(n.left);
				 
				 if(n.right != null)
					 nextLevel.add(n.right);
				 
			 }
			 
			 result.add(row);
			 
			 currLevel.addAll(nextLevel);
	
		 }
		 
		 return result;
	        
	 }

	public static void main(String[] args) {
		Binary_Tree_Level_Order_Traversal t = new Binary_Tree_Level_Order_Traversal();
		TreeNode root =t.new TreeNode(1);

		root.left = t.new TreeNode(2);
		root.right =t.new TreeNode(3);

		root.left.right = t.new TreeNode(4);
		root.right.left = t.new TreeNode(5);

		Binary_Tree_Level_Order_Traversal b = new Binary_Tree_Level_Order_Traversal();
		System.out.println(b.levelOrder(root));

	}

}
