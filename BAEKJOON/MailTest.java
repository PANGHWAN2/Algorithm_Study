package BAEKJOON;

public class MailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pw= "";
		MailTest mt = new MailTest();
		mt.getPw();

	}

	public void getPw() {
		// TODO Auto-generated method stub

		char[] charSet = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
				'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		String str = "";

		int idx = 0;
		for (int i = 0; i < 10; i++) {
			idx = (int) (charSet.length * Math.random());
			str += charSet[idx];
		}
		System.out.println(str);
	}
}
