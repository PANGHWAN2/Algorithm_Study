package Level1;

public class CollatzConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.println(solution(626331));
	}

	public static int solution(int num) {
		int answer = 0;
		long renum = num;//int 범위초과 때문에 long사용 626311
		while (renum != 1) {
			answer++;
			if (renum % 2 == 0) {
				renum = renum / 2;
			} else {
				renum = (renum * 3) + 1;
			}
		}
		if (answer >= 500) {
			answer = -1;
		}
		return answer;
	}
}
