package ds.arrays;

import java.util.ArrayList;
/**
 * Input : k = 3
 * Return : [1,3,3,1]
 * 
 *       1
 *     1 2 1
 *    1 3 3 1
 *   1 4 6 4 1
 * 1 5 10 10 5 1
 * 
 * @author pragati
 *
 */
public class PascalTriangle {

	public ArrayList<Integer> getRow(int A) {

		ArrayList<Integer> pascalTraigle = new ArrayList<>();
		pascalTraigle.add(1);
		pascalTraigle.add(1);
		
		if(A==0) {
			ArrayList<Integer> singleRow = new ArrayList<>();
			singleRow.add(1);
			return singleRow;
		}
		for (int j = 2; j <= A; j++) { 
			ArrayList<Integer> row = new ArrayList<>(pascalTraigle);
			for (int i = 0; i < j-1; i++) {
				
//				System.out.println("Current row value : " + row.toString() );
//				System.out.println("Current pascalTraigle triangle value : " + pascalTraigle.toString() );
//				System.out.println("\nNext Pass: "+ j);
//				System.out.println("set value at Index: " + (i+1) +" Sum = "+ pascalTraigle.get(i) + " + "+ pascalTraigle.get(i+1));
				row.set(i+1, (pascalTraigle.get(i) + pascalTraigle.get(i+1)));
				
			}
//			System.out.println("Adding 1 to last");
			
			row.add(1);
			pascalTraigle = row;
//			System.out.println();

		}
		return pascalTraigle;
	}

	public static void main(String[] args) {
		PascalTriangle pt = new PascalTriangle();
		
		for(int i = 0; i< 8; i++) {
			System.out.println(pt.getRow(i));
		}
		

	}

}
