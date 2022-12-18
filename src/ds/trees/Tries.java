package ds.trees;

import java.util.*;

import ds.trees.TreeTraversals.Node;
/**
 * Input: [zebra, dog, duck, dove]
 * Output: {z, dog, du, dov}
 * @author pragati
 *
 */
public class Tries {
	
	static final int ALPHABATES_SIZE = 26; 
	static Tries root;
	Tries[] child = new Tries[ALPHABATES_SIZE];
	boolean isWordEnd;
	
	int freq; 
	Tries(){
		freq = -1;
		
		isWordEnd = false;
		for(int i = 0 ; i<ALPHABATES_SIZE ; i++) {
			child[i] = null;
		}
	}
	public static ArrayList<String> prefix(ArrayList<String> A) {
		ArrayList<String> prefix = new ArrayList<>();
		
		for(String key : A) {
			int length = key.length();
			StringBuffer sb = new StringBuffer();
			Tries alpha = root;
			int i = 0;
			int index = key.charAt(i) -'a';
			while(alpha.child[index].child.length != 1 && i < length) {
				
				sb.append(alpha.child[index].str);
				i++;
			}
			prefix.add(sb.toString());
		}
		return prefix;
		
    }
	
	
	static void  insert(String key) {
		Tries crawl = root;
		int keyLength = key.length();
		for(int i = 0 ; i <keyLength; i++) {
			int index = key.charAt(i) - 'a';
			if(crawl.child[index] == null) {
				
				crawl.child[index] = new Tries();
			}else {
				crawl.child[index].freq++;
			}
			
			crawl = crawl.child[index];
		}
		
		crawl.isWordEnd  = true;
		
	}
	
	static void printTries() {
		Tries temp = root;

		if (temp == null) {
			return;
		}
		while (temp.child.length != 0) {

			for (int i = 0; i < temp.child.length; i++) {
				System.out.println(temp.str + "-");
				
			}
			temp = temp.c;
			
		}
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


	void search(String key) {
		
	}
	public static void main(String[] args) {
		String[] keys = new String[] {"zebra", "dog", "duck", "dove"};
		Tries t = new Tries();
		root = new Tries();
		
		for(int i = 0 ; i<keys.length ; i++) {
			insert(keys[i]);
		}
		
		System.out.println(root);
//		
//		printTries();
//		
//		ArrayList<String> res = prefix(new ArrayList<String>(Arrays.asList( "zebra", "dog", "duck", "dove")));
//		for(int i = 0;i<res.size() ; i ++) {
//			System.out.println(res.get(i).toString());
//		}

	}

	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return child.toString();
		}
}
