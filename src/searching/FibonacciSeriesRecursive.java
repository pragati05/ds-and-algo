package searching;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeriesRecursive {

	
	static Map<Integer,Integer> hm = new HashMap<>();
	static int fibo(int n){
		
		if(n < 3) {
			return 1;
		}else {
			if(hm.containsKey(n)) {
				return hm.get(n);
			}
			
			int f = fibo(n-1) + fibo(n-2);
			hm.put(n, f);
			return f;
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(fibo(10));

	}

}
