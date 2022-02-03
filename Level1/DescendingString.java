package Level1;

import java.util.Arrays;
import java.util.Collections;

public class DescendingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AZCbcBdefg";
		DescendingString ds = new DescendingString();
		System.out.println(ds.solution5(s));
		
		
	}

	public String solution1(String s) {
		//char[] str = s.toCharArray();
		Character [] str = new Character [s.length()];
		for (int i = 0; i < str.length; i++) {
			str[i] = s.charAt(i);
		}
		Arrays.sort(str,Collections.reverseOrder());
		s = "";
		for(int i=0; i<str.length; i++) {
			s += str[i];
		}
		return s;
	}
	public String solution2(String s) {
	      String answer = "";
	      char[] temp = s.toCharArray();	
	      int[] intTemp = new int[temp.length];
	      for(int i =0; i<temp.length; i++){
	          intTemp[i]=(int)temp[i];
	      }
	      Arrays.sort(intTemp);
	      for(int i =0; i<intTemp.length; i++){
	          temp[intTemp.length-1-i]= (char)intTemp[i];
	      }
	      answer = new String(temp);
	      return answer;
	  }
	public String solution3(String s) {
		char arr[] = s.toCharArray();
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder(new String(arr,0,arr.length));
		return sb.reverse().toString();
	}
	public String solution4(String s) {
	        String answer = "";
	        char[] str = s.toCharArray();

	        for(int i = 0; i < s.length() - 1; i++){
	            for(int j = 0; j < s.length() - 1 -i; j++){
	                if((int)str[j] < (int)str[j+1]){
	                    char temp = str[j];
	                    str[j] = str[j+1];
	                    str[j+1] = temp;
	                }
	            }
	        }
	        answer = new String(str);

	        return answer;
	    }
	public String solution5(String s){
	    char[] ch = s.toCharArray();
	        String lower = "";
	        String upper = "";

	        for(int i = 0; i < ch.length; i++) {
	            int chnum = ch[i];

	            if(chnum >= 65 && chnum <= 90)
	                upper += ch[i];
	            else
	                lower += ch[i];
	        }

	        char[] chUpper = upper.toCharArray();
	        char[] chLower = lower.toCharArray();
	        upper = ""; 
	        lower = "";

	        Arrays.sort(chUpper);
	        Arrays.sort(chLower);

	        for(int i = chUpper.length - 1; i >= 0; i--)
	            upper += chUpper[i];
	        for(int i = chLower.length - 1; i >= 0; i--)
	            lower += chLower[i];

	        return lower + upper;
	    }
}
