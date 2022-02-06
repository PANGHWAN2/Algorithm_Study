package Level1;

public class StringPY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "pPoooyY";
		String s = "Pyy";
		StringPY PY = new StringPY();
		System.out.println(PY.solution3(s));
	}

	boolean solution1(String s) {
		boolean answer = true;
		char[] str = s.toCharArray();
		int cntp = 0;
		int cnty = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == 'p' || str[i] == 'P') {
				cntp++;
			} else if (str[i] == 'y' || str[i] == 'Y') {
				cnty++;
			}
		}
		if (cntp == cnty) {
			return answer;
		} else {
			return !answer;
		}
	}

	boolean solution2(String s) {
		s = s.toLowerCase();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'p')
				count++;
			else if (s.charAt(i) == 'y')
				count--;
		}

		if (count == 0)
			return true;
		else
			return false;
	}

	boolean solution3(String s) {
		s = s.toUpperCase();
		return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
	}
}
