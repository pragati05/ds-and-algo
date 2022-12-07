package ds.arrays;

import java.util.*;

/**
 * Input = [1, 2, 3]; Output = [1, 2, 4]
 * 
 * @author pragati
 *
 */
public class AddOneToNumber {

	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		ArrayList<Integer> oneNumber = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		int carry = 0;

		for (int i = 0; i < A.size(); i++) {
			sb.append(A.get(i));
		}

		String[] strSplit = sb.toString().split("");
		// Now convert string into ArrayList

		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));

		oneNumber.add(1);

		for (int i = 0; i < strList.size() -1; i++) {
			oneNumber.add(0, 0);
		}

		for (int i = strList.size() - 1; i >= 0; i--) {

			int sum = Integer.parseInt(strList.get(i)) + oneNumber.get(i) + carry;

			if (sum <= 9) {
				carry = 0;

			} else {
				carry = 1;
			}

			result.add(0, sum % 10);

		}
		if(carry == 1) {
			result.add(0,carry);
		}
		
		Iterator<Integer> it = result.iterator();
		int i = 0;
		while (it.hasNext() && it.next() == 0) {
		  ++i;
		}
		result.subList(0, i).clear();
		
		return result;
	}

	public static void main(String[] args) {
		AddOneToNumber addNum = new AddOneToNumber();
		ArrayList<Integer> result = addNum.plusOne(new ArrayList<>(Arrays.asList(0,0,9, 9, 9, 9, 9 )));
		System.out.println(result.toString());
	}

}
