package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class Treasure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++)
			arr1[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			arr2[i] = sc.nextInt();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < n; i++)
			answer += arr1[i] * arr2[n - i - 1];
		System.out.println(answer);
	}
}
