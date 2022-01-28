package Level1;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaesarCipher cc = new CaesarCipher();
		System.out.println(cc.solution2("aBc",3));
	}

	public String solution1(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}
			answer += ch;
		}
		return answer;
	}
	public String solution2(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch > (char)64 && ch <(char)91) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			} else if (ch > (char)96 && ch <(char)123) {	
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			}
			answer += ch;
		}
		return answer;
	}
}
