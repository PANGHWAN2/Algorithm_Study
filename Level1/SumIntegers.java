package Level1;

public class SumIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumIntegers si = new SumIntegers();
		System.out.println(si.solution2(3, 5));
	}

	public long solution1(int a, int b) {
		long answer = 0;
		if (a < b) {
			for (int i = a; i <= b; i++) {
				answer += i;
			}
		} else {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		}
		return answer;
	}
	public long solution2(int a, int b) {
		long answer = 0;
		for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)
			answer += i;

		return answer;
	}

}
