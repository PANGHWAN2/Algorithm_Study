package Level1;

public class AddingXNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] numbers = {1,2,3,4,6,7,8,0};
		int[] numbers = {5,8,4,0,6,7,9};
		AddingXNumber an = new AddingXNumber();
		System.out.println(an.solution(numbers));
	}
    public int solution(int[] numbers) {
    int answer = 45;
    for(int i : numbers) {
        answer -= i;
    }    
    return answer;
}
}
