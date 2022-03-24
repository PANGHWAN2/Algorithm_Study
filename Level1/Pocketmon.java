package Level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Pocketmon {
    public static void main(String[] args) {
        Pocketmon pn = new Pocketmon();
        int[] nums = {3,3,3,2,2,2};
        int answer = pn.solution2(nums);
        System.out.println(answer);
    }
    public int solution1(int[] nums) {
        int answer = 0;
        //배열의 길이의 /2만큼의 선택이 가능함, 배열은 항상 짝수 길이
        int numsLength = nums.length/2;
        //선택이 가능한 종류의 최댓값, hash set을 사용하여 중복 제거
        HashSet<Integer> arr = new HashSet<>();
        for(int n : nums){
            arr.add(n);
        }
        for (Integer integer : arr) {
            if(answer == numsLength){
                return answer;
            }
            answer++;
        }

        return answer;
    }
    public int solution2(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
}