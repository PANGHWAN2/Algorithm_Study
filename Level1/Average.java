package Level1;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]ar = new int[] {1,2,3,4};
		
		System.out.println(solution(ar));
		
		double num = 10;
		int n=4;
		
		double ans = num/n;
		System.out.println(ans);
	}
    public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        } 
        //answer = sum/arr.length;
        answer = (double)sum/(double)arr.length;
        return answer;
    }
}
