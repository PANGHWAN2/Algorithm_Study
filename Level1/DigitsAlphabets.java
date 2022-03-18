package Level1;

public class DigitsAlphabets {

	public static void main(String[] args) {
		//String s = "one4seveneight";
		String s = "23four5six7";
		//String s = "2three45sixseven";
		//String s = "123";
		// TODO Auto-generated method stub
		DigitsAlphabets da = new DigitsAlphabets();
		System.out.println(da.solution2(s));
		
	}
    public int solution1(String s) {

    String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
    String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        for (int i = 0 ; i <10 ; i++){
            s = s.replace(word[i] , num[i]);
        }
        return Integer.parseInt(s);
    }
    public int solution2(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}
