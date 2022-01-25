package Level1;

public class EvenAndOdd {
	public static void main(String[] args) {
		EvenAndOdd eo = new EvenAndOdd();
		System.out.println(eo.solution2(100));
	}

	public String solution1(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}

	public String solution2(int num) {
		String answer = "";
		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}
}