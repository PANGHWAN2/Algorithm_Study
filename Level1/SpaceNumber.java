package Level1;

import java.util.Arrays;

public class SpaceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpaceNumber sn = new SpaceNumber();
		System.out.println(Arrays.toString(sn.solution(2,5)));
	}

	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long num = x;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			cnt++;
			answer[i] = num * cnt;
		}
		return answer;
	}
}
