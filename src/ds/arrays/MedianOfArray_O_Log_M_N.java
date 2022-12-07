package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfArray_O_Log_M_N {

	public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		
		int aSize = a.size();
		int bSize = b.size();
		
		if(aSize > bSize) {
			return findMedianSortedArrays(b, a);
		}
		
		int low = 0; 
		int high = aSize;
		int realMed = ((aSize+bSize)+1 )/ 2;
		
		while(low<=high) {
			int cut1 =  (low+high)/2;
			int cut2 =  realMed - cut1;
			
			
			int l1 = (cut1 == 0 )? Integer.MIN_VALUE:a.get(cut1-1);
			int l2 = (cut2 == 0 )?Integer.MIN_VALUE:b.get(cut2-1);
			int r1 = (cut1 == aSize)?Integer.MAX_VALUE:a.get(cut1);
			int r2 = (cut2 == bSize)?Integer.MAX_VALUE:b.get(cut2);
			
			if((l1<=r2) && (l2 <= r1 )) {
				
				if((aSize + bSize) % 2 !=0) {
					return Integer.max(l1, l2);
				}else {
				return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
				}
				
			}else {
				if(l1 > r2) {
					high = cut1-1;
				}else {
					low  = cut1+1;
				}
			}
		}
		
		return 0.0;
	}
	
	public static void main(String[] args) {
		MedianOfArray_O_Log_M_N med = new MedianOfArray_O_Log_M_N();
		double res = med.findMedianSortedArrays(new ArrayList<>(Arrays.asList( -43, -25, -18, -15, -10, 9, 39, 40 )), new ArrayList<>(Arrays.asList(-2)));
		System.out.print(res);

	}

}
