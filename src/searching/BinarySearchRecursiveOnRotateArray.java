package searching;

public class BinarySearchRecursiveOnRotateArray {

	public static void main(String[] args) {

		int[] input = new int[] { 180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177};
		
		int left = 0;
		int right = input.length - 1;
		int searchElement = 42;
		
		int index = binarySearch(input, left, right, searchElement);
		System.out.println(index);
//		
//		input = new int[] {10, 13, 1, 2, 3, 5, 8};
//		System.out.println(binarySearch(input, 0, input.length-1, 5));
//		System.out.println(binarySearch(input, 0, input.length-1, 13));
//		System.out.println(binarySearch(input, 0, input.length-1, 21));
//			
//		input = new int[] {11, 12, 13, 15, 18, 1, 3, 5};
//		System.out.println(binarySearch(input, 0, input.length-1, 13));
//		System.out.println(binarySearch(input, 0, input.length-1, 5));
//		System.out.println(binarySearch(input, 0, input.length-1, 0));

	}
	
	static int binarySearch(int[] input,int left,int right,int searchElement) {
		int mid = (left + right) / 2;
		
		System.out.println("Left: "+ left + " : " + input[left]);
		System.out.println("Right: " + right + " : "+input[right]);
		System.out.println("Mid: "+ mid + " : " +input[mid]); 
		System.out.println("******************************");
		
		
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
