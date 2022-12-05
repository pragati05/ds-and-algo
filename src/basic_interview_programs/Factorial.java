package basic_interview_programs;

public class Factorial {

	public static void main(String[] args) {
		int fact = 5;
		int res = 1;
		
		for(int i = 1; i <= fact ; i++) {
			res = res * i;
		}
		
		System.out.println(res);

	}

}
