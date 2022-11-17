package ds.linkedlist.concepts;

class DLLNode extends Node{
	Node prev = null;
	
	DLLNode(int data){
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "<DLLNode ["+ data + "]>";
	}
	
}

public class DLL implements LinkedList{

	Node HEAD = null;
	Node TAIL = null;
	
	public void insertFirstElement(Node new_node) throws Exception {
		if(this.HEAD!=null) {
			throw new Exception("This is not first element");
		}else {
			this.HEAD = new_node;
			this.TAIL = new_node;
		}
		
	}

	public void insertElementAtBegining(Node new_node) throws Exception {
		if(this.HEAD == null) {
			throw new Exception("List is empty, cannot add node as first element");
			//insertFirstElement(new_node);
		}else {
			new_node.next = this.HEAD;
			new_node.prev = null;
			this.HEAD.prev = new_node;
			this.HEAD = new_node;
			
		}
		
	}

	public void insertElementAtEnd(Node new_node) throws Exception {
		if(this.HEAD==null && this.TAIL == null) {
			throw new Exception("List is empty, cannot add node as first element");
			//insertFirstElement(new_node);
		}else {
			this.TAIL.next = new_node;
			new_node.prev = this.TAIL;
			new_node.next = null;
			this.TAIL = new_node;
		}
		
	}

	public void insertElementInMiddle(int pos, Node new_node) throws Exception {
		if(pos > getSize()) {
			throw new Exception("Please enter valid position. Entered position is greater than List size: "+ getSize());
		}else if(pos == 1) {
			insertElementAtBegining(new_node);
		}else {
			int count = 1;
			Node temp = this.HEAD;
			while(count < pos-1) {
				temp = temp.next;
				count++;
			}
			new_node.next = temp.next;
			new_node.prev = temp;
			temp.next = new_node;
			new_node.next.prev = new_node;
		
		}
		
	}

	public Node deleteElementAtBegining() {
		Node deletedNode = this.HEAD;
		if(this.HEAD == null) {
			System.out.println("List is empty");
		}else if (getSize() == 1){
			this.HEAD = null;
			return deletedNode;
		}else {
			deletedNode = this.HEAD;
			this.HEAD = this.HEAD.next;
			this.HEAD.prev = null;
		}
		return deletedNode;
	}

	public Node deleteElementAtEnd() {
		Node deleted_node = this.TAIL;
		if(this.HEAD == null) {
			System.out.println("List is empty");
		}else if (getSize() == 1){
			this.HEAD = null;
			return deleted_node;
		}else {
			this.TAIL = this.TAIL.prev;
			this.TAIL.next = null;
		}
		return deleted_node;
	}

	public Node deleteElementInMiddle(int pos) {
		Node deleted_node=null;
		if(this.HEAD == null) {
			System.out.println("List is empty");
		}else if(pos ==1 ) {
			deleteElementAtBegining();
		}else {
			int count = 1;
			Node temp = this.HEAD;
			
			while(count < pos -1) {
				temp = temp.next;
				count++;
			}
			System.out.println("Temp: "+temp);
			deleted_node = temp.next;
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}
		return deleted_node;
	}

	public int getSize() {
		if(this.HEAD == null) {
			return 0;
		}
		int size = 0;
		Node temp = this.HEAD;
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
		
	}

	public void print() {
		System.out.println("**** Printing DLL *** ");
		if(this.HEAD==null) {
			System.out.println("Empty");
			return;
		}
		Node temp = this.HEAD;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		
		System.out.println();
		temp = this.TAIL;
		while(temp!=null) {
			System.out.print( "<-"+ temp.data );
			temp = temp.prev;
		}
		
		System.out.println("\nHEAD: "+this.HEAD.data+" TAIL: "+this.TAIL.data);
		System.out.println("*********************************");
	}

	public static void main(String[] args) throws Exception {
		DLL dll = new DLL();
		
		dll.insertFirstElement(new DLLNode(4));
		dll.print();
		
		
		dll.insertElementAtBegining(new DLLNode(2));
		dll.insertElementAtBegining(new DLLNode(1));
		dll.print();
		
		
		dll.insertElementAtEnd(new DLLNode(5));
		dll.insertElementAtEnd(new DLLNode(6));
		dll.print();
		
		dll.insertElementInMiddle(3, new DLLNode(3));
		dll.insertElementInMiddle(4, new DLLNode(44));
		dll.print();
		
		dll.deleteElementAtBegining();
		dll.deleteElementAtBegining();
		dll.print();
		
		dll.deleteElementAtEnd();
		dll.deleteElementAtEnd();
		dll.print();
		
		dll.deleteElementInMiddle(2);
		dll.print();
		
		dll.deleteElementInMiddle(1);
		dll.deleteElementInMiddle(1);
		dll.print();
		
		
		
	}
	}
