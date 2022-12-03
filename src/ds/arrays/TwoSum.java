package ds.arrays;

import java.util.*;

public class TwoSum {
	public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        
        HashSet<Integer> count = new HashSet<>(A);
        System.out.println(count.toString());
        
        return res;
        
    }
	
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		ts.twoSum(new ArrayList<>(Arrays.asList(2,7,11,15,15)), 9);
	}
}
