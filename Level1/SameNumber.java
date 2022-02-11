package Level1;

import java.util.Arrays;

public class SameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 3, 0, 1, 1, 0, 2, 3, 4, 4, 2, 2, 2, 2, 1 };
		SameNumber sn = new SameNumber();
		System.out.println(Arrays.toString(sn.solution2(arr)));
	}

	public int[] solution1(int[] arr) {
		int[] answer = {};
		int cnt = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			cnt++;
			if (arr[i] == arr[i + 1]) {
				cnt--;
			}
		}
		answer = new int[cnt + 1];
		int idx = 0;
		for (int i = 0; i < arr.length - 1; i++) {
				answer[idx++] = arr[i];
				if(arr[i] == arr[i+1]) {
					idx--;
					continue;				
				}
				
		}
		answer[answer.length-1] = arr[arr.length-1];
		return answer;
	}
	public int[] solution2(int[] arr) {
		int[] answer = {};
		int cnt = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				cnt++;
			}
		}
		answer = new int[cnt + 1];
		int idx = 0;
		for (int i = 0; i < arr.length - 1; i++) {
				if(arr[i] != arr[i+1]) {
					answer[idx++] = arr[i];			
				}
				
		}
		answer[answer.length-1] = arr[arr.length-1];
		return answer;
	}
}
