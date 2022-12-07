package searching;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * An array element is peak if it is NOT smaller than its neighbors. 
 * Input array {5, 10, 20, 15}, 20 is the only peak element.
 * @author pragati
 *
 */
public class FindPeakElement {
	public int solve(ArrayList<Integer> A) {
        int i = 0;
        int res = 0;
        while(i < A.size()-1){
            if(A.get(i) > A.get(i+1)){
            	res = A.get(i);
            	return res;
            	
            }
            i++;
        }
        return A.get(i);
    }
	
	
	public static void main(String[] args) {
		FindPeakElement peak = new FindPeakElement();
		int res = peak.solve(new ArrayList<>(Arrays.asList( 5,2,2,3)));
		System.out.println(res);
	}

}
