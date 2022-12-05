package basic_interview_programs;

public class Armstrong {

	public static void main(String[] args) {
		int n = 1;
		int temp = n;
		int r = 0;
		int res = 0;
		while (n > 0) {
			r = n % 10;
			res = res + (r * r * r);
			n = n / 10;
		}

		if (temp == res) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is  not armstrong");
		}

	}

}
