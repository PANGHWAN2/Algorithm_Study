package Level1;

import java.util.Scanner;

public class Rope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int answer = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		answer = arr[0] * n;
		int cnt = n - 1;
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] * cnt > answer) {
				answer = arr[i] * cnt;
			}
			
			cnt--;
		} 
		System.out.println(answer);

	}

}
