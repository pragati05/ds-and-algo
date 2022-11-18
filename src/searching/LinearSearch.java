package searching;

public class LinearSearch {
	static int[] input = new int[] { 10, 3, 1, 43, 34, 60, 76 };
	static int searchElement = 76;
	
	public static int linearSearch(int[] arr, int k) {
		for(int i = 0; i < arr.length; i++) {
			if(input[i] == k) {
				System.out.println("Element Found");
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(linearSearch(input, searchElement));
		System.out.println(linearSearch(input, 0));
	}
}
