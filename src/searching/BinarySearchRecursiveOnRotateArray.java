package searching;

public class BinarySearchRecursiveOnRotateArray {

	public static void main(String[] args) {

		int[] input = new int[] { 40, 50, 60, 10, 20, 30 };
		
		int left = 0;
		int right = input.length - 1;
		int searchElement = 20;
		
		int index = binarySearch(input, left, right, searchElement);
		System.out.println(index);
		
		input = new int[] {10, 13, 1, 2, 3, 5, 8};
		System.out.println(binarySearch(input, 0, input.length-1, 5));
		System.out.println(binarySearch(input, 0, input.length-1, 13));
		System.out.println(binarySearch(input, 0, input.length-1, 21));
			
		input = new int[] {11, 12, 13, 15, 18, 1, 3, 5};
		System.out.println(binarySearch(input, 0, input.length-1, 13));
		System.out.println(binarySearch(input, 0, input.length-1, 5));
		System.out.println(binarySearch(input, 0, input.length-1, 0));

	}
	
	static int binarySearch(int[] input,int left,int right,int searchElement) {
		int mid = (left + right) / 2;
		if(right < left) {
			return -1;
		}else if (input[mid] == searchElement) {
			return mid;
		} else if (searchElement > input[mid] ) {
			if(searchElement > input[right]) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		} else if ( searchElement < input[mid] ) {
			if(searchElement < input[left]) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return binarySearch( input,left,right,searchElement);
	}
}
