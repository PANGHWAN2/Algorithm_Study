package Level1;

import java.util.Arrays;

public class Budget {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {1,3,2,5,4};
		int budget = 9;
		Budget bt = new Budget();
		System.out.println(bt.solution(d,budget));
	}

	public int solution(int[] d, int budget) {
		int sum = 0;
		int count = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			if (sum + d[i] > budget) {
				break;
			}
			sum += d[i];
			count++;
		}
		return count;
	}
}
