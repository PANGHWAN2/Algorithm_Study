package Level1;

public class DotProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		DotProduct dp = new DotProduct();
		System.out.println(dp.solution(a,b));
	}

	public int solution(int[] a, int[] b) {
		int answer = 0;
		for(int i = 0 ; i < a.length; i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}
}
