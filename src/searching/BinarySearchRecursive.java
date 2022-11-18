package searching;

public class BinarySearchRecursive {

	public static void main(String[] args) {

		int[] input = new int[] { 10, 20, 30, 40, 50, 60 };
		
		int left = 0;
		int right = input.length - 1;
		int searchElement = 50;
		
		int index = binarySearch(input, left, right, searchElement);
		System.out.println(index);		
		

	}
	
	static int binarySearch(int[] input,int left,int right,int searchElement) {
		int mid = (left + right) / 2;
		if (input[mid] == searchElement) {
			return mid;
		} else if (input[mid] < searchElement) {
			left = mid + 1;
		} else if (input[mid] > searchElement) {
			right = mid - 1;
		}
		return binarySearch( input,left,right,searchElement);
	}
}
