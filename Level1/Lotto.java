package Level1;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		Lotto lo = new Lotto();
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };

		System.out.println(Arrays.toString(lo.solution1(lottos, win_nums)));
	}

	public int[] solution1(int[] lottos, int[] win_nums) {
		int zero = 0;
		int matched = 0;

		for (int l : lottos) {
			if (l == 0)
				zero++;
			else {
				for (int w : win_nums) {
					if (l == w) {
						matched++;
						break;
					}
				}
			}
		}

		int min = matched;
		int max = matched + zero;

		int[] answer = { Math.min(7 - max, 6), Math.min(7 - min, 6) };
		return answer;
	}

	public int[] solution2(int[] lottos, int[] win_nums) {
		int[] answer = { 0, 0 };
		int zeroCnt = 0;

		Arrays.sort(lottos);
		for (int i = 0; i < 6; i++) {
			if (lottos[i] != 0)
				break;
			zeroCnt++;
		}

		Arrays.sort(win_nums);
		for (int j = 0; j < 6; j++) {
			for (int k = zeroCnt; k < 6; k++) {
				if (win_nums[j] != lottos[k])
					continue;
				answer[0]++;
				answer[1]++;
			}
		}

		answer[0] += zeroCnt;

		for (int i = 0; i < 2; i++) {
			if (answer[i] == 6)
				answer[i] = 1;
			else if (answer[i] == 5)
				answer[i] = 2;
			else if (answer[i] == 4)
				answer[i] = 3;
			else if (answer[i] == 3)
				answer[i] = 4;
			else if (answer[i] == 2)
				answer[i] = 5;
			else
				answer[i] = 6;
		}

		return answer;
	}
}
