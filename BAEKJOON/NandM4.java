package BAEKJOON;

import java.util.Scanner;

public class NandM4 {

	private static int n,m;
	private static int[] map;
	private static boolean[] visit;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[m];
		visit = new boolean[n+1];
		
		dfs(0);
		
	}

	private static void dfs(int num) {

		if (num == m) {
			
			for (int i=0; i<m; i++) {
				System.out.print(map[i] + " ");
			}
			System.out.println();
			
		} else {
			
			for (int i=1; i<=n; i++) {
				
				if (num == 0) {
					map[num] = i;
					dfs(num+1);
				} else if (map[num-1] <= i) {
					map[num] = i;
					dfs(num+1);
				}
			}
			
		}
		
	}
}
