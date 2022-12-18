package ds.trees;



public class Binary_Tree_Maximum_Path_Sum {
	
	class TreeNode {
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

	public int maxPathSum(TreeNode root) {
	        
		return helper(root);
		
	  }
	
	int helper(TreeNode node){
		if(node == null || node.left == null || node.right == null)
			return 0;
		
		int max = node.val + node.left.val + node.right.val;
		return Math.max(helper(node.left), 
				helper(node.right));
		 
	}
	public static void main(String[] args) {
		Binary_Tree_Maximum_Path_Sum b = new Binary_Tree_Maximum_Path_Sum();
		TreeNode root = b.new TreeNode(1, b.new TreeNode(2),  b.new TreeNode(3));
		System.out.println(b.maxPathSum(root));

	}

}
