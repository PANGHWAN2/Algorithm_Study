package Level1;

import java.util.Arrays;

public class FlipArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipArray fa = new FlipArray();
		System.out.println(Arrays.toString(fa.solution(12348)));
	}

	public int[] solution(long n) {
		String str = "";
		str += n;
		int[] answer = new int[str.length()];
		int cnt = 0;
		while (n > 0) {
			answer[cnt] = (int) (n % 10);
			n /= 10;
			cnt++;
		}
		return answer;
	}

}
