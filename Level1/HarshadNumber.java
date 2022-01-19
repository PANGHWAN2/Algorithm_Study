package Level1;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12;
		HarshadNumber hn = new HarshadNumber();
		System.out.println(hn.solution(x));
		System.out.println("-------------------------");    
		int num = 12;
		int N = num;
        int sum = 0;
        boolean answer = false;
        
        
        while(num!=0){
            sum += num % 10;
            num = num/10;
        }
        if(N%sum==0){
            answer = true;
        }

		System.out.println(N + " % " + sum + " = " + N%sum);
		System.out.println(answer);
		System.out.println("-------------------------");
	}

    public boolean solution(int x) {
        int num = x;
        int sum = 0;
        boolean answer = false;
        while(num!=0){
            sum += num % 10;
            num = num/10;
        }      
        if(x%sum==0){
            answer = true;
        }
        return answer;
    }
}
