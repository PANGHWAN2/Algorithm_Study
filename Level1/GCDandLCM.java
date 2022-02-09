package Level1;


import java.util.Arrays;


public class GCDandLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCDandLCM gl = new GCDandLCM();
		System.out.println(Arrays.toString(gl.solution1(12,20)));
		System.out.println(Arrays.toString(gl.solution2(12,20)));
		
	}
	public int[] solution1(int n, int m) {
		int[] answer = new int[2];
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
				answer[1] = n * m / i;
			}
		}
		return answer;
	}

	public int[] solution2(int n, int m) {
		int[] answer = new int[2];
		int cnt = n;
		int gcd = 1;
		while (cnt > 0) {
			if (n % cnt == 0 && m % cnt == 0) {
				n = n / cnt;
				m = m / cnt;
				gcd *= cnt;
				answer[0] = gcd;
				answer[1] = n*m*gcd;
			}
			cnt--;
		}
		return answer;
	}
}

