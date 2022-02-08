package Level1;

import java.util.Arrays;
import java.util.Comparator;

public class StringSortL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StringSortL1 ss = new StringSortL1();
	//String[] strings = {"sun", "bed", "car"};
	String[] strings = {"abce", "abcd", "cdx"};
	int n = 1;
	//int n = 2;

	System.out.println(Arrays.toString(ss.solution2(strings,n)));
		
		
	}
	public String[] solution1(String[] strings, int n) {
		return Arrays.stream(strings).sorted().sorted(Comparator.comparingInt(o -> o.charAt(n))).toArray(String[]::new);
    }
	 public String[] solution2(String[] strings, int n) {
	       String[] answer = new String[strings.length];
	        
	        for (int i = 0; i < strings.length; i++) {
	            answer[i] = strings[i].charAt(n) + strings[i];
	        }
	        
	        Arrays.sort(answer);
	        
	        for (int i = 0; i < answer.length; i++) {
	            answer[i] = answer[i].substring(1);
	        }
	        
	        return answer;
	    }
}

