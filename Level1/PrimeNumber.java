package Level1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pn = new PrimeNumber();
		System.out.println(pn.solution(10));
	}

	public int solution(int n) {
		int answer = 0;
		// 1. 에라토스테네스의 체
		boolean check[] = new boolean[n + 1];

		for (int i = 2; i <= (n / 2); i++) {
			// 2-1. 소수의 배수로써 걸러진 수들은 넘어가고, (4,6,8,9..... 등)
			if (check[i] == true)
				continue;
			// 2-2. 자신을 제외한 배수를 고려하기 위해 i+i; j<=n;j=j+i 조건으로 걸러준다.
			for (int j = i + i; j <= n; j += i) {
				check[j] = true;
			}
		}
		// 3. 걸러지지 않은 수 들의 개수를 카운팅.
		for (int i = 2; i <= n; i++) {
			if (!check[i]) {
				answer++;
			}
		}
		return answer;
	}
}
