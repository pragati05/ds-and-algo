package basic_interview_programs;

public class PalindromNumberCheck {

	public static void main(String[] args) {
		int input = 1221;
		int temp = input;
		StringBuffer sb = new StringBuffer();

		while (temp > 0) {
			int rem = temp % 10;
			sb.append(rem);
			temp = temp / 10;

		}

//		System.out.println(sb.toString());
		if (Integer.parseInt(sb.toString()) == input) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
