package searching;

public class LinearSearch {
	static int[] input = new int[] { 10, 20, 30, 40, 50, 60, 70 };
	static int searchElement = 70;
	
	public static void main(String[] args) {
		for(int i = 0; i < input.length;i++) {
			if(input[i] == searchElement) {
				System.out.println("Element Found");
				break;
			}
			
		}
		
	}
}
