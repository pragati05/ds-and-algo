package basic_interview_programs;

public class FibonacciWithoutRecu {

	static int fib(int num) {
		
		int f1 = 1;
		int f2 = 1;
		int f3 = 0;
		
		if(num <= 2) {
			return 1;
		}
		
		for (int i = 2; i <= num; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;

		}
		return f3;
	}
	public static void main(String[] args) {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.println(fib(i));
			
		}
	

	}

}
