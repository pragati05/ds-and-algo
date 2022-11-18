package searching;

public class BinarySearch {

	public static void main(String[] args) {

		int[] input = new int[] { 10, 20, 30, 40, 50, 60, 70 };
		int left = 0;
		int right = input.length - 1;
		int mid = (left + right) / 2;
		int searchElement = 10;

		while (right >= left) {
			if (input[mid] == searchElement) {
				System.out.println("Element found on index: " + mid);
				break;
			} else if (input[mid] < searchElement) {
				left = mid + 1;
			} else if (input[mid] > searchElement) {
				right = mid - 1;
			}
			mid = (left + right) / 2;
		}

	}
}
