package BAEKJOON;

import java.util.Scanner;

public class HanzoShimada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int answer = 0;
		int max = arr[0];
		int cnt = 0;
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				answer = Math.max(answer,cnt);
				max = arr[i];
				cnt = 0;			
			}
			else 
				cnt++;	
		}
		answer = Math.max(answer,cnt);
		//arr[0]이 제일 큰 경우 max<arr[i] 조건이 실행안되기 때문에
		
		System.out.println(answer);	
	}
}
