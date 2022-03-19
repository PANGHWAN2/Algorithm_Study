package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectTeams {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int Ability[] = new int[num * 2];
		for (int i = 0; i < (num * 2); i++) {
			Ability[i] = scan.nextInt();
		}
		Arrays.sort(Ability);

		int answers[] = new int[num];
		for (int i = 0; i < num; i++) {
			answers[i] = Ability[i] + Ability[Ability.length - i - 1];
		}
		// System.out.println(Arrays.toString(answer));
		Arrays.sort(answers);
		System.out.println(answers[0]);
	}
}
