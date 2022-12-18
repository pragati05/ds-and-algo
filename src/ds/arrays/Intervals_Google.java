package ds.arrays;

import java.util.ArrayList;

public class Intervals_Google {


	
	int calculateTotalIntervalLength(int[][] input) {
		
		int sum = 0;
		
		for(int i = 0; i < input.length ; i++) {
			sum += (input[i][1] - input[i][0] + 1);
		}
		return sum;
	}
	
	int getOverlap(int x1, int y1, int x2, int y2) {
		if(Math.max(x1, x2) <= Math.min(y1, y2)) {
			return Math.min(y1, y2) - Math.max(x1, x2) + 1;
		}
		return 0;
	}
	
	int minimizeNonOverlapInterval(int[][] input , int k) {
		
		int totalLength = calculateTotalIntervalLength(input);
		int maxRedCovered = Integer.MIN_VALUE;;
		
		int n = input.length;
		int lastElement = input[n-1][1];
		
		if(k > lastElement ) {
			return 0;
		}
		for (int i = 1; i <= (lastElement - k + 1); i++) {
			int total = 0;
			for(int j = 0 ; j<n;j++) {
				total += getOverlap(i, (i+k-1), input[j][0], input[j][1]);
			}
			maxRedCovered = Math.max(maxRedCovered, total);
			
		}
		
		return totalLength - maxRedCovered;
	}
	
	
	public static void main(String[] args) {
		int[][] input = new int[][] {{1,2},{5,8},{10,12}};
		int k = 6;
		
		input = new int[][] {{1,10}};
		k = 10;
		
		
		input = new int[][] {{2,3},{6,8},{15,17}};
		k = 8;
		
		
		Intervals_Google i = new Intervals_Google();
		
		int res = i.minimizeNonOverlapInterval(input,k);
		System.out.print(res);
		
	}
	
	

}
