package ds.stack;
import java.util.*;

/**
 * Input 1:
 *   A =   ["2", "1", "+", "3", "*"]  ,Output = 9
 *   
 *	Input 2:
 *   A = ["4", "13", "5", "/", "+"] , Output = 6
 * @author pragati
 *
 */
public class EvaluateExpression2 {
	
	int performOpertaion(String op, Stack stack) throws Exception {
		
		int num2 = stack.pop();
		int num1 =  stack.pop();
		
		if(op == "+")
			stack.push(num1 + num2);
		else if(op == "-")
			stack.push(num1 - num2);
		else if(op == "*")
			stack.push(num1 * num2);
		else if(op == "/")
			stack.push(num1 / num2);
		
		return stack.peek();
	}

	 public int evalRPN(ArrayList<String> A)  {
	 	Stack stack = new Stack(A.size());
	 	List<String> operands = Arrays.asList(new String[]{"*", "/", "+", "-"});
	 	
	 	for(int i = 0; i < A.size(); i++){
	 		try{
		 		if(!operands.contains(A.get(i))){
		 			stack.push(Integer.parseInt(A.get(i)));
		 		}else{
		 			performOpertaion(A.get(i), stack);
		 			
		 		} 
		 	}catch(Exception e){
		 		System.out.println(e);
		 		return -1;
		 	}
	 	}
	 	return stack.peek();

     }

	public static void main(String[] args) throws Exception {
		
		EvaluateExpression2 exp = new EvaluateExpression2();
		ArrayList<String> input= new ArrayList<>();

		input.add("2");
		input.add("1");
		input.add("+");
		input.add("3");
		input.add("*");

		int res = exp.evalRPN(input);
		System.out.println(input.toString() + " res: " + res);

		input= new ArrayList<>();

		input.add("4");
		input.add("13");
		input.add("5");
		input.add("/");
		input.add("+");

		res = exp.evalRPN(input);
		System.out.println(input.toString() + " res: " + res);
		
		
		input= new ArrayList<>();

		input.add("2");
		input.add("2");
		input.add("+");
		
		

		res = exp.evalRPN(input);
		System.out.println(input.toString() + " res: " + res);



	}

}
