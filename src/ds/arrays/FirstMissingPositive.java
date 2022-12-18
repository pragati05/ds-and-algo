package ds.arrays;

public class FirstMissingPositive {
	
	static public int firstMissingPositive(int[] nums) {
        int inputLength = nums.length;
        int[] index = new int[inputLength+1];
        for(int i = 0; i < inputLength; i++){
            if(!(nums[i] <=0 || nums[i] > inputLength)){
                
                 index[nums[i]] = nums[i];
            }
        }
    for(int i = 1; i <=inputLength; i++){
        if(index[i] == 0 ){
            System.out.println(i);
            return i;
        }
       
    }
       
        return inputLength+1;
    }
	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[] {7,8,9}));

	}

}
