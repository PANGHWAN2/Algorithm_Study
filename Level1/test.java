package Level1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] grades = {"A+","D+","F","C0"};
		int[] weights = {2,5,10,3};
		int c = 50;
		System.out.println(solution(grades,weights,c));
		
	}

	public static int solution (String[] grades, int[] weights, int threshold) {
		int answer = 0;
		
		for(int i = 0 ; i < grades.length;i++) {
			if(grades[i]=="A+") 
				answer += weights[i]*10;
			else if(grades[i]=="A0")
				answer += weights[i]*9;
			else if(grades[i]=="B+")
				answer += weights[i]*8;
			else if(grades[i]=="B0")
				answer += weights[i]*7;
			else if(grades[i]=="C+")
				answer += weights[i]*6;
			else if(grades[i]=="C0")
				answer += weights[i]*5;
			else if(grades[i]=="D+")
				answer += weights[i]*4;
			else if(grades[i]=="D0")
				answer += weights[i]*3;
			else if(grades[i]=="F")
				answer += weights[i]*0;
		
		}
		
//		answer = answer-threshold;
		return answer;
	}
	
	
}
