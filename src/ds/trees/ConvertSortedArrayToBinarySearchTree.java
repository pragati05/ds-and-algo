package ds.trees;

public class ConvertSortedArrayToBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums) {
		
		
		int left = 0;
		int right = nums.length-1;
		return convertTree(nums,left,right);
		
		
        
        
    }
	
	TreeNode convertTree(int[] nums , int left , int right){
		
		TreeNode temp = null;
		
			if(left > right) {
				return null;
			}
		
			int mid = (left + right ) / 2;
			
			temp = new TreeNode(nums[mid]);
			
			temp.left = convertTree(nums,left , mid-1);
			temp.right = convertTree(nums, mid+1, right);
		
		
		return temp;
		
	}
	public static void main(String[] args) {
		int[] num = new int[] {-10,-3,0,5,9};
		
		ConvertSortedArrayToBinarySearchTree tree = new ConvertSortedArrayToBinarySearchTree();
		tree.sortedArrayToBST(num);

	}

}
