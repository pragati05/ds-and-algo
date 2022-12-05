package basic_interview_programs;

public class PalindromStringCheck {

	public static void main(String[] args) {
		String input = "-*-";

		StringBuffer sb = new StringBuffer();

		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));

		}

		System.out.println(sb.toString());
		if (sb.toString().equals(input)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
