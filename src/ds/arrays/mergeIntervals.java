package ds.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mergeIntervals {
	
	
	  public class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
		@Override
		public String toString() {
			return "Interval [start=" + start + ", end=" + end + "]";
		}
	      
	      
	  }
	 
	  
	  
	  public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		  ArrayList<Interval> res = new ArrayList<Interval>();
		  
		  intervals.sort(
				  (Interval i1, Interval i2) -> Integer.compare(i1.start , i2.start));
		
		  for(Interval curr: intervals) {
			  
		  }
		
		  
		  return res;
	  }

	  
	public static void main(String[] args) {
		// A : [ (1, 10), (2, 9), (3, 8), (4, 7), (5, 6), (6, 6) ]
		// (1, 10) (2, 9) (3, 8) (4, 7) (5, 6) (6, 6) 
		
		// [1,3],[2,6],[8,10],[15,18],

		// [1,6],[8,10],[15,18].
		mergeIntervals m = new mergeIntervals();
		Interval i1 = m.new Interval(4,4);
		Interval i2 = m.new Interval(5,100);
		
		ArrayList<Interval> input = new ArrayList<>();
		input.add(i1);input.add(i2);
		
		ArrayList<Interval>  output = m.merge(input);
		System.out.println(output);


	}

}
