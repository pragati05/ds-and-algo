package ds.stack;

public class BalancedParantheses {

	public boolean isBalancedParantheses(String input){
		Stack stack = new Stack(input.length());

		for(int i = 0 ; i <  input.length(); i++){
			if(input.charAt(i) == '('){
				try{
					stack.push(1);
				}catch(Exception e){
					return false;
				}

			}else if(input.charAt(i) == ')'){
				try{
					stack.pop();
				}catch(Exception e){
					return false;
				}
			}
		}

		if(stack.top >= 0){
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		BalancedParantheses bp = new BalancedParantheses();
		
		String input = "((()))";
		boolean result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
		
		
		input = "((())";
		result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
		
		input = "(()))";
		result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
		
		
		input = "(";
		result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
		
		input = ")";
		result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
		
		input = "";
		result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
		
		input = ")(";
		result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
		
		input = "()()";
		result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
		
		input = "((())())(())";
		result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
		
		input = "((())((";
		result = bp.isBalancedParantheses(input);
		System.out.println( input + ": "+ result);
	}

}
