package brillo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * int[] intArray = new int[]{ 24,2,51,15,5,60 };
 * @author pragati
 * 
 * 2nd largest - 24 -
 * 51 - largest
 *
 */
public class BrilloInterview {

	
	private int findSecondLargest(int[] intArray) {
		
		//int[] intArray = ;
		int largestNum = intArray[0];
		int secondLargest = largestNum;
		
		for(int i = 1 ; i<intArray.length;i++) {
			if(intArray[i] > largestNum) {
				secondLargest = largestNum;
				largestNum = intArray[i];
				
			}
		}
		return secondLargest;
	}
	
	
	public static void main(String[] args) {
		
		BrilloInterview sl  = new BrilloInterview();
		int secondLargest = sl.findSecondLargest(new int[]{ 24,2,51,15,5,60 });
		

	}

}
