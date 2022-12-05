package basic_interview_programs;

public class BinarySearchRecurssion {

	int binarySearch(int[] arr, int left, int right, int searchElement) {

		int mid = (left + right) / 2;

		if (arr[mid] == searchElement) {
			return mid;
		} else if (searchElement > arr[mid]) {
			return binarySearch(arr, mid + 1, right, searchElement);
		} else if (searchElement < arr[mid]) {
			return binarySearch(arr, left, mid - 1, searchElement);
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 5, 6, 8 };
		int searchElement = 8;
		int left = 0;
		int right = arr.length - 1;
		BinarySearchRecurssion b = new BinarySearchRecurssion();
		int res = b.binarySearch(arr, left, right, searchElement);
		System.out.println("result :" + res);
	}
}
