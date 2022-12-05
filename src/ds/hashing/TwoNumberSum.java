package ds.hashing;

import java.util.*;

/**
 * Input: [2, 7, 11, 15], target=9 Output: index1 = 1, index2 = 2
 * 
 * @author pragati
 *
 */
public class TwoNumberSum {

	public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
		// Map which saves Value and index
		ArrayList<Integer> result = new ArrayList<>();
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < A.size(); i++) {
			if(hm.containsKey(B - A.get(i))) {
				result.add(A.indexOf(B - A.get(i)) + 1);
				result.add(i+1);
				break;
			}else {
				hm.put(A.get(i), i);
			}
		}
		

		return result;

	}

	public static void main(String[] args) {
		TwoNumberSum ts = new TwoNumberSum();
		System.out.println(ts.twoSum(new ArrayList(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8)), -3).toString());
	}
}
