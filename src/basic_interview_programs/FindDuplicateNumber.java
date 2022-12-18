package basic_interview_programs;

import java.util.*;
import java.util.Map.Entry;import java.util.stream.Collector;
import java.util.stream.Collectors;
public class FindDuplicateNumber {

	
	static HashMap<Integer,Integer> duplicate = new HashMap<>();
	
	
	static HashMap<Integer,Integer>  findDuplicate(int[] arr){
		
		for(int i = 0 ; i < arr.length; i++) {
			if(duplicate.containsKey(arr[i])) {
				duplicate.put(arr[i], duplicate.get(arr[i]) + 1);
				
				
			}else {
				duplicate.put(arr[i], 1);
			}
		}
		
		return duplicate;
		
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,4,3,2};
		HashMap<Integer,Integer>  res = findDuplicate(arr);
		
		Set<Entry<Integer,Integer>>  keySet =  res.entrySet();
//		
//		for(Integer i: res.keySet()) {
//			if(duplicate.containsKey(i) && duplicate.get(i) >=2) {
//				System.out.println("Duplicate number: " + i);
//			}
//		}
		
		List<Entry<Integer,Integer>> res1 = keySet.stream().filter(i -> i.getValue() >= 2).collect(Collectors.toSet());
		
		//res.keySet().stream().filter(i -> i.ge).forEach(System.out.println("Duplicate number: " + i));
	
		

	}

}
