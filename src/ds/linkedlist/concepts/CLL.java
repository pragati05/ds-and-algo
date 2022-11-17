package ds.linkedlist.concepts;

class CLLNode extends Node{
	
	CLLNode(int data){
		this.data = data;
	}

	@Override
	public String toString() {
		return "<CLLNode ["+ data + "]>";
	}
	
}


public class CLL implements LinkedList {
	Node HEAD = null;
	Node TAIL = null;


	@Override
	public Node deleteElementAtBegining() {
		Node deleted_node = null;
		
		if(this.HEAD==null) {
			System.out.println("List is empty");
		}else {
			deleted_node = this.HEAD;
			this.HEAD = this.HEAD.next;
			this.TAIL.next = this.HEAD;
			deleted_node.next = null;
		}
		
		return deleted_node;
	}

	@Override
	public Node deleteElementAtEnd() {
		Node deleted_node = null;
		if(this.HEAD==null) {
			System.out.println("List is empty");
		}else if(this.HEAD.next==null) {
			// Only 1 element in list
			deleted_node = this.HEAD;
			this.HEAD = null;
			this.TAIL = null;
		}else {
			// reach second last element
			Node temp = this.HEAD;
			while(temp.next.next!=this.HEAD) {
				temp = temp.next;
			}
			deleted_node = temp.next;
			temp.next = this.HEAD;
			this.TAIL = temp;
		}
		return deleted_node;
	}

	@Override
	public Node deleteElementInMiddle(int pos) {
		Node deleted_node = null;
		if(this.HEAD==null) {
			System.out.println("List is empty");
		}
		
		int size = this.getSize();
		if(pos > size || pos<1) {
			System.out.println("Invalid pos : "+ pos);
		}else if(pos == 1) {
			deleted_node = this.deleteElementAtBegining();
		}else if(pos == size) {
			deleted_node = this.deleteElementAtEnd();
		}else {
			int temp_pos = 1;
			Node temp = this.HEAD;
			while(temp_pos < pos-1) {
				temp = temp.next;
				temp_pos++;
			}
			
			deleted_node = temp.next;
			temp.next = deleted_node.next;
		}
		return deleted_node;
	}

	@Override
	public int getSize() {
		int size = 0;
		if(this.HEAD==null) {
			return 0;
		}
		Node temp = this.HEAD;
		do {
			size++;
			temp = temp.next;
		}while(temp!=this.HEAD);
		return size;
	}

	@Override
	public void print() {
		System.out.println("Printing CLL");
		if(this.HEAD==null) {
			System.out.println("Empty");
			return;
		}
		Node temp = this.HEAD;
		do {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}while(temp!=this.HEAD);
		System.out.print(temp.data );
		System.out.println("\nHEAD: "+this.HEAD+" TAIL: "+this.TAIL);
		System.out.println("\n\n");
		
	}

	@Override
	public void insertFirstElement(Node new_node) throws Exception {
		if(this.HEAD != null) {
			throw new Exception("This is not a first element");
		}
		System.out.println("Inserting first element");
		
		this.HEAD = new_node;
		this.TAIL = new_node;
		this.TAIL.next = this.HEAD;
		
		System.out.println("Inserted first element");
	}
	

	@Override
	public void insertElementAtBegining(Node new_node) throws Exception {
		if(this.HEAD == null) {
			throw new Exception("Linked list is empty");
		}
		new_node.next = this.HEAD;
		this.HEAD = new_node;
		this.TAIL.next = this.HEAD;
		
	}

	@Override
	public void insertElementAtEnd(Node new_node) throws Exception  {
		if(this.HEAD == null) {
			throw new Exception("Linked list is empty");
		}
	 this.TAIL.next = new_node;
     this.TAIL = new_node ;
     this.TAIL.next = this.HEAD;
		
	}

	@Override
	public void insertElementInMiddle(int pos, Node new_node) throws Exception  {
		if(this.HEAD == null) {
			throw new Exception("Linked list is empty");
		}
		int size = this.getSize();
		if(pos > size || pos<1) {
			throw new Exception("Invalid pos : "+ pos);
		}
		if(pos == 1) {
			this.insertElementAtBegining(new_node);
		}else {
			int temp_pos = 1;
			Node temp = this.HEAD;
			while(temp_pos < pos-1) {
				temp = temp.next;
				temp_pos++;
			}
			new_node.next = temp.next;
			temp.next = new_node;
			
		}
	
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		CLL cll = new CLL();
		cll.print();
		
    	cll.insertFirstElement(new CLLNode(5));
    	cll.print();
    	
		cll.insertElementAtBegining(new CLLNode(4));
		cll.print();
	
		cll.insertElementAtBegining(new CLLNode(3));
		cll.insertElementAtBegining(new CLLNode(1));
		cll.print();
		
		cll.insertElementAtEnd(new CLLNode(6));
		cll.insertElementAtEnd(new CLLNode(8));
		cll.insertElementAtEnd(new CLLNode(10));
		cll.print();
		
		cll.insertElementInMiddle(2, new CLLNode(2));
		cll.insertElementInMiddle(7, new CLLNode(7));
		cll.insertElementInMiddle(9, new CLLNode(9));
		cll.print();
		
		
		cll.deleteElementAtBegining();
		cll.print();
		
		cll.deleteElementAtEnd();
		cll.print();

	
		cll.deleteElementInMiddle(1);
		cll.print();
		
		cll.deleteElementInMiddle(9);
		cll.print();
		
		cll.deleteElementInMiddle(7);
		cll.print();
		cll.deleteElementInMiddle(3);
		cll.print();

	}

	

}
