package ds.queue;
import ds.linkedlist.concepts.SLL;

import java.util.Iterator;

import ds.linkedlist.concepts.Node;


// deleteElementAtEnd
// deleteElementAtBegining

// insertElementAtBegining
// insertElementAtEnd
// getSize


class SLLNode extends Node{
	
	SLLNode(int data){
		this.data = data;
	}

	@Override
	public String toString() {
		return "<SLLNode ["+ data + "]>";
	}
	
	
}

public class DeQueLL<E> extends SLL{


	DeQueLL(){}


	int peekFirst(){
		return getHEAD().data;

	}
	int peekLast(){
		return getTAIL().data;
	}

	int removeFirst() throws Exception {
		Node node = deleteElementAtBegining();
		if(node != null) {
			return node.data;
		}else {
			throw new Exception("Cannot remove beacuse queue is empty");
		}
	}

	int removeLast() throws Exception{
		Node node = deleteElementAtEnd();
		if(node != null) {
			return node.data;
		}else {
			throw new Exception("Cannot remove beacuse queue is empty");
		}
	}

	void addLast(int value) throws Exception{
		Node node = new SLLNode(value);
		insertElementAtEnd(node);
	}


	void addFirst(int value) throws Exception{
		Node node = new SLLNode(value);
		insertElementAtBegining(node);
	}
	boolean isEmpty(){
		return getHEAD() == null;
	}


	public static void main(String[] args) throws Exception {
		DeQueLL dq = new  DeQueLL();

		dq.addFirst(3);
		dq.addFirst(2);
		dq.addFirst(1);
		dq.print();
		
		dq.addLast(4);
		dq.addLast(5);
		dq.addLast(6);
		dq.print();
		
		dq.removeFirst();
		dq.print();
		
		dq.removeLast();
		dq.print();

		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		
		dq.removeLast();
		dq.removeLast();
		dq.removeLast();
		dq.removeLast();
		dq.removeLast();
		

	}



}
