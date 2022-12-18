package ds.trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeTraversals {
	class Node {
		int data;
		Node right, left;

		Node(int data) {
			this.data = data;
			this.right = null;
			this.left = null;

		}
	}

	public static void inorder(Node n) {
		if (n == null) {
			return;
		}
		inorder(n.left);
		System.out.print(n.data + "->");
		inorder(n.right);

	}

	public static void preorder(Node n) {
		if (n == null) {
			return;
		}
		System.out.print(n.data + "->");
		preorder(n.left);
		preorder(n.right);

	}

	public static void postorder(Node n) {
		if (n == null) {
			return;
		}
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data + "->");
	}

	public static void levelOrder(Node root) {
		
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		Node temp;
		while(!q.isEmpty()) {
			temp = q.poll();
			System.out.print(temp.data + "->");
			
			if(temp.left !=null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
		
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

		System.out.println("\n*** IN-ORDER *****");
		t.inorder(root);

		System.out.println("\n*** PRE-ORDER *****");
		t.preorder(root);

		System.out.println("\n*** POST-ORDER *****");
		t.postorder(root);
		
		System.out.println("\n*** Level-ORDER *****");
		t.levelOrder(root);

	}

}
