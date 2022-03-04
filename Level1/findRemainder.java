package Level1;

public class findRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n = 10;
		int n = 12;
		findRemainder fr = new findRemainder();
		System.out.println(fr.solution(n));
	}

	int solution(int n) {
		   
	    int answer = 0; 
	    for (int i=2; i<n; i++){ 
	        if(n%i == 1){ 
	            answer = i; 
	            break; 
	        } 
	    } 
	    return answer; 
	}
}
