package ds.stack;

public class Stack {

	int[] arr;
	int top;
	int size;

	Stack(int s){
		top = -1;
		size = s;
		arr = new int[size];
	}

	public void push(int num) throws Exception{
		if(top == size-1){
			throw new Exception("Stack Overflow Error");
		}
		arr[top+1] = num;
		top++;
	}

	public int pop() throws Exception{
		if(top == -1){
			throw new Exception("Stack Underflow Error");
		}

		int num = arr[top];
		top--;
		return num;
	}

	public int peek(){
		if(top <= -1 || top > size){
			return -1;
		}
		return arr[top];
	}

	public void  print(){
		if(top == -1){
			System.out.println("Stack is Empty");
			return;
		}
		for(int i = top; i >= 0; i--){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) throws Exception {
		Stack stack = new Stack(10);
		System.out.println("TOP: " + stack.top + ", Size: " + stack.size + " , arr: " + stack.arr);
		stack.print();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Top Element: " +  stack.peek());
		
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);


		stack.print();


		System.out.println("Top Element: " +  stack.peek());
		
		//stack.push(11);

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		System.out.println("Top Element: " +  stack.peek());
		
		stack.pop();
		stack.pop();
//		stack.pop();
//		stack.pop();

		System.out.println("Top Element: " +  stack.peek());

	}

}
