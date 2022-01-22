package Level1;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareRoot sr = new SquareRoot();
		System.out.println(sr.solution(1));
	}
    public long solution(long n) {
        long answer = -1;
        for (long i = 0 ; i <= n ; i++){
            if(i*i == n){
                answer = (i+1)*(i+1);
                break;    
            }
        }    
    return answer;
    }
}
