package ds.trees;

import java.util.ArrayList;
import java.util.List;

import ds.trees.TreeTraversals.Node;
/**
 * Input: root = [3,9,20,null,null,15,7] Output: [[3],[20,9],[15,7]]
 * 
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. 
 * (i.e., from left to right,
 * then right to left for the next level and alternate between).
 * @author pragati
 *
 */
public class BinaryTreeZigzagLevelOrderTraversal {
	
	
public List<List<Integer>> zigzagLevelOrder(Node root) {
	
	List<List<Integer>> res = new ArrayList<>();
	List<Integer> r= new ArrayList<>();
	if(root == null)
	       return res;
	r.add(root.data);
	res.add(r);
	 
	zigZag(root , 2, res);
	return res;
        
    }


	void zigZag(Node n, int level, List<List<Integer>> res) {
		if(n == null)
			return;
		
		List<Integer> t = new ArrayList<>();
		if(level % 2 == 0) {
			if(n.right != null)
				t.add(n.right.data);
			if(n.left != null)
				t.add(n.left.data);
		}else {
			if(n.left != null)
				t.add(n.left.data);
			if(n.right != null)
				t.add(n.right.data);
		}
		if(!t.isEmpty())
			res.add(t);
		
		zigZag(n.left , level+1, res);
		zigZag(n.right , level+1, res);
		
	}
	

	public static void main(String[] args) {
		TreeTraversals t = new TreeTraversals();
		Node root = t.new Node(1);

		root.left = t.new Node(2);
		root.right = t.new Node(3);
		
		root.left.right = t.new Node(4);
		root.right.left = t.new Node(5);
		
		BinaryTreeZigzagLevelOrderTraversal b = new BinaryTreeZigzagLevelOrderTraversal();
		System.out.println(b.zigzagLevelOrder(root));
	
	}

}
