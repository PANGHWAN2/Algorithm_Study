package BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int time = 0;
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			time += arr[i];
			answer += time;
		}
		System.out.println(answer);
	}

}
