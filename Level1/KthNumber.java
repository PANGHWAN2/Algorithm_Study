package Level1;

import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array =  {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		KthNumber kn = new KthNumber();
		System.out.println(Arrays.toString(kn.solution2(array,commands)));
	}
	
	//Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준
	//값에 의한 복사이므로 복사된 배열에서 값을 바꿔도 원본 배열의 값이 바뀌지 않음!


	   public int[] solution1(int[] array, int[][] commands) { 
	       int[] answer = new int[commands.length]; 
	       for(int i=0; i<commands.length; i++){ 
	           int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); 
	           Arrays.sort(temp); 
	           answer[i] = temp[commands[i][2]-1]; 
	       } 
	       return answer; 
	   }
	   public int[] solution2(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        int num = 0;
	        for(int[] info : commands){
	            int i = info[0];
	            int j = info[1];
	            int k = info[2];

	            int[] buf = Arrays.copyOfRange(array,i-1,j);
	            Arrays.sort(buf);
	            answer[num] = buf[k-1];
	            num++;
	        }
	        return answer;
	    }

}
