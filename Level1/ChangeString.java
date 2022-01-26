package Level1;


public class ChangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "try hello World";  
		String s = "ch ch ch ch";
		ChangeString cs = new ChangeString();
		System.out.println(cs.solution2(s));
	}
    public String solution1(String s) {
    	String answer = "";
        String[] str = s.split("");
        
        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        } 
        
        return answer;
    }
    public String solution2(String s) {
        char[] strchar= s.toCharArray();
        int idx = 0;
        for (int i=0; i<strchar.length; i++){
        	
        	if(strchar[i]==' ') {
        		idx = -1;
        	}
        	if(idx%2==0) {
        		if(strchar[i] > (char)96 && strchar[i] <(char)123)
            		strchar[i]=(char) (strchar[i]-32);
        	}
        	else {
        		if(strchar[i] > (char)64 && strchar[i] <(char)91)
            		strchar[i]=(char) (strchar[i]+32);
        	}
        	idx++;
        } 
        String answer = new String(strchar);
        return answer;
    }
}
