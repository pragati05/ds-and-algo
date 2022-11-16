package ds.linkedlist.concepts;

public interface LinkedList {
	
	Node HEAD=null;
	Node TAIL=null;
	
	public void insertFirstElement(Node new_node) throws Exception ;
	public void insertElementAtBegining(Node new_node) throws Exception ;
	public void insertElementAtEnd(Node new_node) throws Exception ;
	public void insertElementInMiddle(int pos, Node new_node) throws Exception ;
	
	public Node deleteElementAtBegining();
	public Node deleteElementAtEnd();
	public Node deleteElementInMiddle(int pos);
	
	public int getSize();
	public void print();
	
}
