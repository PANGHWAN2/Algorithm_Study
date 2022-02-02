package Level1;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringHandling sh = new StringHandling();
		System.out.println(sh.solution("a234"));
		
	}

	public boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				return false;
			}
		}
		/*
		 * else { return false; }
		 */
//    	boolean answer = true;
//        return answer;
	}
}
