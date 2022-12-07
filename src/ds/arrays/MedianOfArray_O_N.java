package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfArray_O_N {

	
	public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		
		List<Integer> result = new ArrayList<>();

		int i = 0;
		int j = 0;

		while(i < a.size() && j < b.size()){
			if(a.get(i) <= b.get(j)){
				result.add(a.get(i));
				i++;
			}else{
				result.add(b.get(j));
				j++;
			}
			
			
		}

		while(i < a.size()){
			result.add(a.get(i));
			i++;

		}
		while(j < b.size()){
			result.add(b.get(j));
			j++;
		}
		int result_size = result.size();
		
		if(result_size % 2 == 0){
			return (double)(result.get(result_size/2) + result.get((result_size/2) - 1)) / 2;
		}else{
			result_size = result_size / 2;
			return result.get(result_size);

		}
		
	}
	
	public static void main(String[] args) {
		MedianOfArray_O_N med = new MedianOfArray_O_N();
		double res = med.findMedianSortedArrays(new ArrayList<>(Arrays.asList(0, 23 )), new ArrayList<>(Arrays.asList( )));
		System.out.print(res);


	}

}
