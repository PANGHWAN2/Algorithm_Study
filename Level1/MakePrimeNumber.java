package Level1;

public class MakePrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,7,6,4};
		MakePrimeNumber mn = new MakePrimeNumber();
		System.out.println(mn.solution(nums));
	}

	public int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];

					answer += isPrime(sum) ? 1 : 0;
				}
			}
		}

		return answer;
	}


//	 소수 여부 반환 메서드
//	  @param num: [int] 숫자
//	  @return [boolean] 소수 여부
	 
	private boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			// 나눠 떨어질 경우
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
