package ds.linkedlist.problems;

class Node{
	int data;
	
	Node(int data){
		this.data = data;
	}
}
public class callByReference {

	static void  change(Node nn) {
		nn.data +=1;
	}
	
	static void  change(String str) {
		str = str + "test";
	}
	public static void main(String[] args) {
		Node n = new Node(5);
		change(n);
		System.out.println(n.data);
		
		String s = "Pragati";
		s = new String("Pragati");
		change(s);
		System.out.println(s);
		
	}

}
