package Level1;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDigits ad = new AddDigits();
		System.out.println(ad.solution(12345));
	}
    public int solution(int n) { 
	int answer = 0;
	while(n != 0) {
		answer+=n%10;	
		n = n/10;	
	}
        return answer;
    }
}
