package ds.arrays;

import java.util.ArrayList;

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
				
				System.out.println("Current row value : " + row.toString() );
				System.out.println("Current pascalTraigle triangle value : " + pascalTraigle.toString() );
				System.out.println("\nNext Pass: "+ j);
				
				System.out.println("set value at Index: " + (i+1) +" Sum = "+ pascalTraigle.get(i) + " + "+ pascalTraigle.get(i+1));
				row.set(i+1, (pascalTraigle.get(i) + pascalTraigle.get(i+1)));
				
			}
			System.out.println("Adding 1 to last");
			
			row.add(1);
			pascalTraigle = row;
			System.out.println();

		}
		return pascalTraigle;
	}

	public static void main(String[] args) {
		PascalTriangle pt = new PascalTriangle();
		System.out.println("res:  "+ pt.getRow(0));

	}

}
