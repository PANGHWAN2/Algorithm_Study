package Level1;

public class SumOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfFactors sf = new SumOfFactors();
		System.out.println(sf.solution(12));
	}

	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		return answer;
	}
}
