class Solution {
	public String solution(int a, int b) {
		String[] answer = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int count = -1;

		for (int i = 0; i < a - 1; i++) {
			count += month[i];
		}

		return answer[(count + b) % 7];
	}
}

/*
 * 둠스데이 알고리즘(Doom's Day Algorithm)
 * 둠스데이 알고리즘(Doomsday algorithm)은 존 호턴 콘웨이가 발명한 알고리즘으로, 임의의 날짜에 해당하는 요일을 쉽게 구하는
 * 데에 쓰인다.
 * 
 * 한 해에서 다음 날짜는 언제나 요일이 같다.
 * 
 * 2월의 마지막 날 (2월 28일이나 2월 29일.)
 * 4월 4일
 * 6월 6일
 * 8월 8일
 * 10월 10일
 * 12월 12일
 * 이것은 일과 월이 모두 4부터 12사이의 짝수로 되어 있으므로 외우기 쉽다. 한편, 다음과 같은 날들도 위의 날짜들과 요일이 같다.
 * 
 * 5월 9일
 * 9월 5일
 * 7월 11일
 * 11월 7일
 * (이것은 흔히 'nine-to-five', 'seven-eleven'이라고 외운다.)
 * 
 * 그리고 1월과 3월은 다음 날짜를 사용한다.
 * 
 * 1월 3일(윤년의 경우는 1월 4일)(이것은 보통 the 3rd 3 years in 4 and the 4th in the 4th 로
 * 외운다.)
 * 3월 0일 (3월 1일의 전날. 2월의 마지막 날에 해당)
 * 이와 같이 한 해에서 요일이 같은 날들을 일컬어 둠스데이(Doomsday)라고 한다. 이 날짜와 그 해의 둠스데이의 요일만 기억하고
 * 있으면, 날짜에 따른 요일을 쉽게 구할 수 있다.
 */