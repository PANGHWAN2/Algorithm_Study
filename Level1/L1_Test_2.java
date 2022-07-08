package Level1;

public class L1_Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Solution {
	    public int solution(int[] numbers) {
	    	int sum = 0;
	    	boolean [] arr = new boolean[10];

	    	for (int i = 0; i < numbers.length; i++) {
				arr[ numbers[i] ] = true;
			}
	    	
	    	for (int i = 0; i < arr.length; i++) {
				if(!arr[i]) sum += i;
			}
	        int answer = sum;
	        return answer;
	    }
	}

}
