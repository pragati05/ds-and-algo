package ds.trees;

public class CheckIfBinary {
	class Node {
		int data;
		Node children[];

		Node(int data) {
			this.data = data;
		}
	}

	public static boolean checkBinary(Node n) {
		if (n == null) 
			return true;
		
		if (n.children == null)
			return true;
	
		if(n.children.length != 2 && n.children.length != 0 ){
			return false;
		}else {
			for(Node child: n.children) {
				if(!checkBinary(child)) {
					return false;
				}
			}
			return true;
		}
		
	}

	

	public static void main(String[] args) {
		CheckIfBinary t = new CheckIfBinary();
		Node root = t.new Node(1);
		
		Node l1_c1 = t.new Node(2);
		Node l1_c2 = t.new Node(3);
		Node l1_c3 = t.new Node(4);
		
		Node l2_c1 = t.new Node(5);
		Node l2_c2 = t.new Node(6);
		Node l2_c3 = t.new Node(7);
		
		Node l3_c1 = t.new Node(8);
		Node l3_c2 = t.new Node(9);
		Node l3_c3 = t.new Node(10);
		
		root.children = new Node[]{l1_c1, l1_c2};
		
		l1_c1.children = new Node[]{l2_c1, l2_c2};
		l1_c2.children = new Node[]{};
//		l1_c3.children = new Node[]{l2_c2, l2_c3};
//		
//		l2_c1.children = new Node[]{};
//		l2_c2.children = new Node[]{l3_c1, l3_c2};
//		l2_c3.children = new Node[]{l3_c3};
		
		System.out.println(t.checkBinary(root));
	}

}
