package Level1;

import java.util.Arrays;

public class DivisibleArraysL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DivisibleArraysL1 db = new DivisibleArraysL1();
		int[] arr = { 10, 9, 7, 5 };
		int divisor = 5;
		System.out.println(Arrays.toString(db.solution2(arr, divisor)));

	}

	public int[] solution1(int[] arr, int divisor) {
		int[] answer = {-1};
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				idx++;
			}
		}
		
		if(idx == 0) {
			return answer;
		}
		
		answer = new int[idx];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer[j++] = arr[i];
			}
		}
		return arrs(answer); 
	}
	public int[] arrs(int[] ar) {
		for(int i = 0 ; i < ar.length; i++) {
			for(int j = 0 ; j < ar.length-1; j++) {
				if(ar[j]>ar[j+1]){
					int temp = ar[j];
					ar[j]= ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		return ar;
	}	
	public int[] solution2(int[] arr, int divisor) {
		 int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
         if(answer.length == 0) {
        	 answer = new int[] {-1};
         }
         Arrays.sort(answer);
         return answer;
	}
}
