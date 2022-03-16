package Level1;

public class Reverse3Notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =125;
		Reverse3Notation rn = new Reverse3Notation();
		System.out.println(rn.solution(n));
	}
	public int solution(int n) {
		String answer = "";
		while(n >= 3) {
			answer += n % 3;
			n /= 3;
		}
		answer += n;
		return Integer.parseInt(answer, 3);
	}
}
