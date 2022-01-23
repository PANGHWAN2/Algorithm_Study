package Level1;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DescendingOrder DO = new DescendingOrder();
		System.out.println(DO.solution(118372));
	}
    public long solution(long n) {
        long answer = 0;
        String str = "";
		str += n;

		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		
		str = "";
		int index = arr.length-1;
		while (index != -1) {
			str += arr[index--];
		}
		answer = Long.parseLong(str);
        return answer;
    }
}
    
