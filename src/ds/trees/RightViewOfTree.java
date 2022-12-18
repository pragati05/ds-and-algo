package ds.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.*;

public class RightViewOfTree {

	class Node {
		int data;
		Node right, left;
		int level;

		Node(int data) {
			this.data = data;
			this.right = null;
			this.left = null;
			this.level = -1;

		}
	}

	static int sumOfNodes(Node node) {
		if (node == null) {
			return 0;
		}
		return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
	}

	public static void levelOrder(Node root,ArrayList<Integer> arr) {

		Queue<Node> q = new ArrayDeque<>();
		int level = 1;
		root.level  = 1;
		arr.add(root.data);
		q.add(root);
		Node temp;
		while (!q.isEmpty()) {
			temp = q.poll();
			System.out.print(temp.data + "," + temp.level +  "->");

			if (temp.left != null) {
				temp.left.level = temp.level +1;
				arr.add(temp.left);
				q.add(temp.left);
				level++;
			}
			if (temp.right != null) {
				temp.right.level = temp.level +1;
				arr.add(temp.right);
				q.add(temp.right);
			}
		}

		
	}

	public static void main(String[] args) {
		RightViewOfTree t = new RightViewOfTree();
		Node root = t.new Node(1);

		root.left = t.new Node(2);
		root.right = t.new Node(3);

		root.left.left = t.new Node(4);
		root.left.right = t.new Node(1);
		root.right.left = t.new Node(1);
		root.right.right = t.new Node(2);

		root.left.right.left = t.new Node(5);
		root.left.right.left.left = t.new Node(6);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		levelOrder(root,arr);
	}

}
