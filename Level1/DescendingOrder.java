package Level1;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DescendingOrder DO = new DescendingOrder();
		System.out.println(DO.solution(79786416));
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

	public long solution2(long n) {
		long answer = 0;
		int ten = 1;
		long tmp_num = n;
		int count = 0;
		int i = 0;

		while (tmp_num != 0)
		{
			count++;
			tmp_num = tmp_num / 10;
		}

		tmp_num = n;
		int arr[] = new int[count];

		while (tmp_num != 0)
		{
			arr[i] = (int) (tmp_num % 10);
			tmp_num = tmp_num / 10;
			i++;
		}

		for (i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for (i = arr.length - 1; i >= 0; i--)
		{
			answer += arr[i] * ten;
			ten *= 10;
		}

		return answer;
	}
}
