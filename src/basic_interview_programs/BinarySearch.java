package basic_interview_programs;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 5, 6, 8 };
		int searchElement = 6;
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == searchElement) {
				System.out.println("Element found at index: " + mid);
				break;
			}
			if (searchElement > arr[mid]) {
				left = mid + 1;
			} else if (searchElement < arr[mid]) {
				right = mid - 1;
			}
		}
		
		if(left>right) {
			System.out.println("Element not found");
		}

	}

}
