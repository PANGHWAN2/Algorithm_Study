package Level1;

public class DivisorAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 13;
		int right = 17;
		DivisorAndSum ds = new DivisorAndSum();
		System.out.println(ds.solution2(left,right));
	}
	 public int solution1(int left, int right) {
	        int answer = 0;

	        for (int i=left;i<=right;i++) {
	         
	            if (i % Math.sqrt(i) == 0) {
	                answer -= i;
	            }
	       
	            else {
	                answer += i;
	            }
	        }

	        return answer;
	    }
	  public int solution2(int left, int right) {
	        int answer = 0;
	        int cnt = 0;
	        for(int i = left; i <= right; i++){
	            cnt = 0;
	            for(int j = 1; j<= i; j++){
	                if( i % j == 0) cnt++;
	            }
	            if( cnt % 2 == 0){
	                answer += i;
	            }else{
	                answer += i * -1;
	            }
	        }
	        return answer;
	    }
}
