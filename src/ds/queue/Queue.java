package ds.queue;

public class Queue {

	int front = 0;
	int rear = -1;
	int size;
	int[] arr; 

	Queue(int s){
		this.size = s;
		arr = new int[size];
	}
	public void enQueue(int num) throws Exception{
		if(rear > size){
			throw new Exception("Queue Overflow");
		}

		arr[rear+1] = num;
		rear++;
	}

	public int deQueue() throws Exception{
		if(front == -1 || front >= size){
			throw new Exception("No element to delete");
		}
		front++;
		return 0;
	}

	public void print(){
		for(int i = front; i <= rear; i++){
			System.out.print(arr[i]+ "-");
		}
	}
	public static void main(String[] args)  throws Exception {
		Queue q = new Queue(10);

		System.out.println("\nFront: " + q.front + ", Rear: " + q.rear );

		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);

		q.print();
		System.out.println("\nFront: " + q.front + ", Rear: " + q.rear );

		q.deQueue();
		q.deQueue();
		q.deQueue();
		q.deQueue();


		q.print();
		System.out.println("\nFront: " + q.front + ", Rear: " + q.rear );


	}

}
