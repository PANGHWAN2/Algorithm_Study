package Level1;
import java.util.Arrays;
public class GymClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int[] lost= {2, 4};
		int[] reserve= {1, 3, 5};
		
		GymClothes gc = new GymClothes();
		System.out.println(gc.solution2(n,lost,reserve));
	}	

	 public int solution1(int n, int[] lost, int[] reserve) {
	        int[] people = new int[n];
	        int answer = n;

	        for (int l : lost) 
	            people[l-1]--;
	        for (int r : reserve) 
	            people[r-1]++;

	        for (int i = 0; i < people.length; i++) {
	            if(people[i] == -1) {
	                if(i-1>=0 && people[i-1] == 1) {
	                    people[i]++;
	                    people[i-1]--;
	                }else if(i+1< people.length && people[i+1] == 1) {
	                    people[i]++;
	                    people[i+1]--;
	                }else 
	                    answer--;
	            }
	        }
	        return answer;
	    }
	 
	   public int solution2(int n, int[] lost, int[] reserve) {
		   
	        int answer = n - lost.length;
	        
	        Arrays.sort(lost);
	        Arrays.sort(reserve);
	        
	        // 여벌 체육복을 가져온 학생이 도난당한 경우
	        for(int i=0; i<lost.length; i++){
	            for(int j=0; j<reserve.length; j++){
	                if(lost[i] == reserve[j]){
	                    answer++;
	                    lost[i] = -1;
	                    reserve[j] = -1; 
	                    break; 
	                }
	            }
	        }
	        // 도난당한 학생에게 체육복 빌려주는 경우
	        for(int i=0; i<lost.length; i++){
	            for(int j=0; j<reserve.length; j++){
	                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
	                    answer++;
	                    reserve[j] = -1; 
	                    break; 
	                }
	            }
	        }
	        return answer;
	    }
}
