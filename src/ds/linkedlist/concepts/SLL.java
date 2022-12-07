package ds.linkedlist.concepts;

import java.util.HashMap;

class SLLNode extends Node{
	
	SLLNode(int data){
		this.data = data;
	}

	@Override
	public String toString() {
		return "<SLLNode ["+ data + "]>";
	}
	
	
}


public class SLL implements LinkedList {
	 Node HEAD = null;
	 Node TAIL = null;

	
	 

	@Override
	public Node deleteElementAtBegining() {
		Node deleted_node = null;
		
	
		if(this.HEAD==null) {
			System.out.println("Cannot delete because list is empty");
		}else {
			deleted_node = this.HEAD;
			this.HEAD = this.HEAD.next;
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
			while(temp.next.next!=null) {
				temp = temp.next;
			}
			deleted_node = temp.next;
			this.TAIL = temp;
			temp.next = null;
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
		while(temp!=null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	@Override
	public void print() {
		System.out.println("Printing SLL");
		if(this.HEAD==null) {
			System.out.println("Empty");
			return;
		}
		Node temp = this.HEAD;
		while(temp!=null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("\nHEAD: "+this.HEAD+" TAIL: "+this.TAIL);
	}

	@Override
	public void insertFirstElement(Node new_node) throws Exception {
		if(this.HEAD != null) {
			throw new Exception("This is not a first element");
		}
		System.out.println("Inserting first element");
		
		this.HEAD = new_node;
		this.TAIL = new_node;
		
		System.out.println("Inserted first element");
	}
	

	@Override
	public void insertElementAtBegining(Node new_node) throws Exception {
		if(this.HEAD == null) {
			insertFirstElement(new_node);
			return;
		}
		new_node.next = this.HEAD;
		this.HEAD = new_node;
		
	}

	@Override
	public void insertElementAtEnd(Node new_node) throws Exception  {
		if(this.HEAD == null) {
			insertFirstElement(new_node);
			return;
		}
	 this.TAIL.next = new_node;
     this.TAIL = new_node ;
		
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
	
	
	
	
	
	public Node getHEAD() {
		return HEAD;
	}


	public Node getTAIL() {
		return TAIL;
	}


	public static void main(String[] args) throws Exception {
		SLL sll = new SLL();
		
		System.out.println(sll.HEAD);
		System.out.println(sll.TAIL);
		sll.print();
		System.out.println("size:" + sll.getSize());
		
		sll.insertFirstElement(new SLLNode(5));
		sll.print();
		System.out.println("size:" + sll.getSize());
		
		
		sll.insertElementAtBegining(new SLLNode(4));
		sll.print();
		System.out.println("size:" + sll.getSize());
		
		sll.insertElementAtBegining(new SLLNode(3));
		sll.insertElementAtBegining(new SLLNode(1));
		sll.print();
		System.out.println("size:" + sll.getSize());
		
		
		
		sll.insertElementAtEnd(new SLLNode(6));
		sll.print();
		sll.insertElementAtEnd(new SLLNode(8));
		sll.insertElementAtEnd(new SLLNode(10));
		sll.print();
		
		sll.insertElementInMiddle(2, new SLLNode(2));
		sll.insertElementInMiddle(7, new SLLNode(7));
		sll.insertElementInMiddle(9, new SLLNode(9));
		sll.print();
		
		
		sll.deleteElementAtBegining();
		sll.print();
		
		sll.deleteElementAtEnd();
		sll.print();

		
		sll.deleteElementInMiddle(1);
		sll.print();
		sll.deleteElementInMiddle(9);
		sll.print();
		sll.deleteElementInMiddle(7);
		sll.print();
		sll.deleteElementInMiddle(3);
		sll.print();

	}

	

}
