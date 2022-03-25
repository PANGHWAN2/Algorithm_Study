package BAEKJOON;

import java.util.Scanner;

public class DongJunsGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int i = n - 1; i > 0; i--)
			while (arr[i] <= arr[i - 1]) {
				arr[i - 1]--;
				answer++;
			}
		System.out.println(answer);
	}
}
