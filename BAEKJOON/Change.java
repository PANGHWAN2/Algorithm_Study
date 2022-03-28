package BAEKJOON;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num = 1000 - num;
		int answer = 0;
		int[] yen = { 500, 100, 50, 10, 5, 1 };
		for (int i = 0; i < 6; i++) {
			if (yen[i] > num) {
				continue;
			}
			answer += num / yen[i];
			num %= yen[i];

		}
		System.out.println(answer);
	}

}
