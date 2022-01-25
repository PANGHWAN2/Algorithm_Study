package Level1;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenAndOdd eo = new EvenAndOdd();
		int num = 100;
		System.out.println(eo.solution(num));
	}
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer = "Even";
        }
        else{
            answer = "Odd";
        }
        
        return answer;
    }
}
