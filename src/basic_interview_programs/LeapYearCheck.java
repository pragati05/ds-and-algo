package basic_interview_programs;

public class LeapYearCheck {

	public static void main(String[] args) {
		int year = 2020;
		if((year % 4 == 0) || (year % 100 ==0 && year % 400 ==0)) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not leap year");
		}

	}

}
