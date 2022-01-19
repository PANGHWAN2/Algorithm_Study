package Level1;

import java.util.Arrays;

public class AdditionOfMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionOfMatrices am = new AdditionOfMatrices();
		int[][]arr1=new int[][] {{1,2},{3,4}};
		int[][]arr2=new int[][] {{3,4},{5,6}};

		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr2));
		System.out.println(Arrays.deepToString(am.solution(arr1,arr2)));
	}
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	int[][] answer = new int[arr1.length][arr1[0].length];
    	//System.out.println(arr1.length);
    	//System.out.println(arr1[0].length);
        for(int i = 0; i<arr1.length; i++) {
        	
            for(int j = 0; j<arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
