package basic_interview_programs;

public class FactorialRecur {

	int fact(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		
		FactorialRecur fac = new FactorialRecur();
		System.out.println(fac.fact(5));

	}

}
