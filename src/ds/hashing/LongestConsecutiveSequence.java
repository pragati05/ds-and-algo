package ds.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence {
	public int longestConsecutive(final List<Integer> A) {

		if (A == null || A.size() == 0)
			return 0;

		Set<Integer> set = new HashSet<Integer>();

		for (Integer i : A)
			set.add(i);

		int max = 1;

		for (Integer num : A) {
			if (set.remove(num)) { // num hasn't been visited {
				int val = num;
				int sum = 1;
				
				while (set.remove(val - 1))
					val--;
				sum  += num-val;
				
				val = num;
				while (set.remove(val + 1))
					val++;
				sum += val-num;
				
				max = Math.max(sum, max);
			}
		}

		return max;
	}

	public static void main(String[] args) {
		LongestConsecutiveSequence l = new LongestConsecutiveSequence();
		List<Integer> A = Arrays.asList(100, 4, 200, 1, 3, 2);
		l.longestConsecutive(A);

	}

}
