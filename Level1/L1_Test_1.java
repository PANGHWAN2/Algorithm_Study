package Level1;

public class L1_Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        for (int i = n; i>=1;i--){
	            if (n % i ==0){
	                answer+=i;
	            }
	        }
	        
	        return answer;
	    }
	}
}
