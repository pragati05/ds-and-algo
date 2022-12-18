package ds.arrays;
 /**
  * 121 - 121 = true
  * 12223 = 3221 - false
  * @author pragati
  *
  */
public class PalindromCheck {

	boolean checkPalindrome(int n) {
		
		StringBuffer sb = new StringBuffer();
		int n2 = n;
		while(n>0) {
			int rem = n % 10;
			sb.append(rem);
			n = n/10;
		}
		
		System.out.println(sb);
		
		//int n3 = Integer.parseInt(sb);
		if(Integer.parseInt(sb.toString()) ==  n2) {
			return true;
		}else {
			return false;
		}
	
	}
	public static void main(String[] args) {
		PalindromCheck p = new PalindromCheck();
		System.out.println(p.checkPalindrome(0));

	}

}

