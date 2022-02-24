package Level1;

import java.util.Arrays;

public class RemoveSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] { 10 };
		int[] arr2 = new int[] { 4, 3, 2, 1 };
		RemoveSmallestNumber rs = new RemoveSmallestNumber();
		System.out.println(Arrays.toString(rs.solution3(arr1)));
		System.out.println(Arrays.toString(rs.solution3(arr2)));
	}

	public int[] solution1(int[] arr) {
		int[] answer = {};
		answer = new int[arr.length - 1];
		int min = arr[0];
	
		
		if (arr.length == 1) {
			answer[0] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			min = Math.min(arr[i], min);
		}
		int index = 0;

		// 가장 작은 수를 제외한 배열 만들어주기
		for (int i = 0; i < arr.length; i++) {
			// 배열의 값이 가장 작은 수라면
			if (arr[i] == min) {
				continue;
			}
			answer[index++] = arr[i];
		}

		return answer;
	}

	public int[] solution2(int[] arr) {
		if (arr.length <= 1) {
			return new int[] { -1 };
			}
		int min = Arrays.stream(arr).min().getAsInt();
		return Arrays.stream(arr).filter(i -> i != min).toArray();
	}

	public int[] solution3(int[] arr) {
		int[] answer = {};
		if (arr.length == 1) {
			answer = new int[arr.length];
			answer[0] = -1;
		} else {
			answer = new int[arr.length - 1];
			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}

			int idx = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == min) {
					continue;
				}
				answer[idx++] = arr[i];

			}
		}

		return answer;
	}

	public int[] solution4(int[] arr) {
		int[] answer = new int[arr.length - 1];
		if (arr.length == 1) {
			return new int[] {-1} ;
		}
		answer = new int[arr.length - 1];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				continue;
			}
			answer[idx++] = arr[i];
		}
		return answer;
	}
}
