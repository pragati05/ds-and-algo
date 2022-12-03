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
public class EvaluateExpression {
	
	 public int evalRPN(ArrayList<String> A)  {
		 	Stack stack = new Stack(A.size());
		 	List<String> operands = Arrays.asList(new String[]{"*", "/", "+", "-"});
		 	
		 	for(int i = 0; i < A.size(); i++){
		 		try{
			 		if(!operands.contains(A.get(i))){
			 			stack.push(Integer.parseInt(A.get(i)));
			 		}else{
	                     
	                     String op =   A.get(i); 
	                     
	                     if(op == "+"){
	                        stack.push(stack.pop() + stack.pop());
	                     }else if(op == "-"){
	                        stack.push(stack.pop() - stack.pop());
	                     }else if(op == "*"){
	                        stack.push(stack.pop() * stack.pop());
	                     }else if(op == "/") {
	                         int num2 = stack.pop();
			                 int num1 =  stack.pop();
	                         System.out.println(num1 + "/" + num2);
	                         stack.push(num1 / num2);
	                    }
	            } 
			 	}catch(Exception e){
			 		System.out.println(e);
			 		return -1;
			 	}
		 	}
		 	return stack.peek();

	     }

	public static void main(String[] args) throws Exception {
		
		EvaluateExpression exp = new EvaluateExpression();
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
