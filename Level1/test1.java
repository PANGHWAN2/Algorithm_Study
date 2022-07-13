package Level1;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] friends = {{"david","demi"},{"frank","demi"},{"demi","james"}};
		String user_id = "david";
		
		System.out.println(Arrays.toString(solution(friends,user_id)));
	}
	public static String[] solution(String[][] friends, String user_id) {
		String[] answer = {};
		for(int i=0;i<friends.length;i++) {
			for(int j=0;j<friends[i].length;j++) {
				if(friends[i][j].equals(user_id)) {
					friends[i][j] = "" ;
				}
			}
		}
		return answer;
		
	}
	
}
