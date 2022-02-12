package Level1;

public class MiddleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "qwer";
		MiddleNumber mn = new MiddleNumber();
		System.out.println(mn.solution2(s));
	}

	public String solution1(String s) {
		String answer = "";
		if (s.length() % 2 != 0)
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		if (s.length() % 2 == 0)
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		return answer;
	}

	public String solution2(String s) {
		return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
	}

}
