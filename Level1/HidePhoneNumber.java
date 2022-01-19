package Level1;

public class HidePhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phone_number = "01071694661";
		String answer = solution(phone_number);
		System.out.println(answer);
		
		//System.out.println(solution("01071694661"));
	}

	public static String solution(String phone_number) {
		String answer = "";
		
		for (int i = 0; i < (phone_number.length() - 4); i++) {
			answer+="*"; 
		}
		answer += phone_number.substring(phone_number.length()-4);
		
		return answer;
	}
}
