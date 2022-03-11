package Level1;

public class NegativePlusPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] absolutes = {4,7,12};	
		boolean[] signs ={true,false,true};
		NegativePlusPositive np = new NegativePlusPositive();
		System.out.println(np.solution2(absolutes,signs));
	}
    public int solution1(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0 ; i < absolutes.length; i++) {
        	if (signs[i] == true) {
        		answer += absolutes[i];
        	}
        	else {
        		answer -= absolutes[i];
        	}
        }    
        return answer;
    }
    public int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        return answer;
    }
}
