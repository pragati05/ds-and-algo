package ds.hashing;

import java.util.*;

/**
 * Given array S = {1 0 -1 0 -2 2}, and target = 0
 * 
 * @author pragati
 *
 */
public class FourNumerSum {

	public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		int firstPointer;
		int endPointer = A.size() - 1;
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for (int i = 0; i < A.size(); i++) {
			for (int j = i + 1; j < A.size(); j++) {
				ArrayList<Integer> tuple = new ArrayList<>();
				int tuple1Value = A.get(i) - A.get(j);

				firstPointer = j;
				while (firstPointer <= endPointer) {
					if (A.get(firstPointer) - A.get(endPointer) == B - tuple1Value) {
						tuple.add(A.get(i));
						tuple.add(A.get(j));
						tuple.add(A.get(firstPointer));
						tuple.add(A.get(endPointer));
						result.add(tuple);
					} else {
						if (A.get(firstPointer) - A.get(endPointer) < tuple1Value) {
							endPointer--;
						} else {
							firstPointer++;
						}
					}
				}

			}
		}
		return result;
	}

	public static void main(String[] args) {
		FourNumerSum fs = new FourNumerSum();
		ArrayList<ArrayList<Integer>> res = fs.fourSum(new ArrayList(Arrays.asList(1, 0, -1, 0, -2, 2)), 0);
		System.out.println(res.toString());

	}

}
