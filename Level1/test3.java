package Level1;

import java.util.Arrays;

public class test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		
		System.out.println(solution(n));
	}
	public static long solution(int n) {
		long answer = 1 ;
		int s = 3;
		int q = n/s;
		int r = n% s;
		
		int[] arr= new int [s];
		for(int i = 0 ; i < s; i++) {
			if(s - r == i) {
				q++;
			}
			arr[i] = q;
			
			answer *= arr[i];
		}
		
		
		
		return answer;
		
	}
}