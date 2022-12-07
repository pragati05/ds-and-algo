package ds.arrays;

public class FoundElement {

	boolean foundElement(int mat[][] , int k) {
		
		int col = mat[0].length;  // 4
		int row = mat.length; // 4
		int i = 0 ; 
		int j = col -1; // 3
				
			while(i >= 0 && i <= (row -1) && j>=0 && j<=(col-1)) {
				if(mat[i][j] > k) {
					j--; // 2 , 1
				}else  if(mat[i][j] == k){
					return true;
				}else {
					i++;
				}
			}
		
		
		return false;
	}
	public static void main(String[] args) {
		
		int mat[][] = { 
				{ 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
		
		FoundElement f = new FoundElement();
		boolean res = f.foundElement(mat,39);
		System.out.println("FoundElement : " + res);
		

	}

}
