package Level1;

public class FindKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindKim fk = new FindKim();
		String[] seoul = { "Jane", "Park", "Kim" };
		System.out.println(fk.solution(seoul));

	}

	public String solution(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			// if (seoul[i] == "Kim") {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
			}
		}
		return answer;
	}
}
