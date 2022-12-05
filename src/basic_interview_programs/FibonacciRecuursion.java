package basic_interview_programs;

public class FibonacciRecuursion {

	static int fib(int n) {
		if (n < 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {
		int input = 10;
		int result = fib(input);
		System.out.println(result);

	}

}
