package BAEKJOON;

//import java.util.ArrayList;
import java.util.Scanner;

public class AntSequence {

	public static void main(String[] args) {
		AntSequence as = new AntSequence();
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		String answer = "1";
		System.out.println(answer);
		for (int i = 0; i < (line - 1); i++) {
			answer = as.sequence(answer);
			System.out.println(answer);
		}
	}

	public String sequence(String answer) {
		String result = "";
		int cnt = 1;

		char ch = answer.charAt(0);
		for (int i = 1; i < answer.length(); i++) {
			if (ch == answer.charAt(i)) {
				cnt++; // 숫자 몇개?
			} else {
				result = result + ch + cnt;
				ch = answer.charAt(i);
				cnt = 1;
			}
		}
		result = result + ch + cnt;
		return result;
	}

}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//ArrayList 사용
//ArrayList antMom = new ArrayList(); // 엄마 개미수열 (바로 위에 수열)
//
//int firstN = 1; // 첫번째 엄마수열을 만듬.
//antMom.add(firstN);
//
//for (int i = 0; i < line; i++) {
//	ArrayList ant = new ArrayList(); // 한 행이 지날때마다 새로운개미수열을 만든다.
//
//	int number = (int) antMom.get(0); // 엄마 개미의 첫번째 방에 있는 숫자부터 검사한다.
//	int count = 0;
//	for (int j = 0; j < antMom.size(); j++) {
//		if (number == (int) antMom.get(j)) // 첫번째숫자(Number)부터 검사해서
//			count++; // 같은숫자가 연속된만큼 count 해준다.
//		else { // 만약 다음 방의 숫자가 number가 아니라면
//			ant.add(number); // (숫자의 연속이 끊긴다면)
//			ant.add(count); // number와 count를 개미에 저장하고
//			number = (int) antMom.get(j); // number는 다음에 검사할 새로운 숫자가 되고
//			count = 1; // 그 숫자는 이미 한번 있는것이니
//		} // 카운트를 1부터 시작한다.
//	}
//	ant.add(number);
//	ant.add(count);
//	for (int k = 0; k < antMom.size(); k++) { // 출력
//		System.out.print(antMom.get(k));
//	}
//	System.out.println();
//	antMom = ant; // 이제 이 개미가 엄마개미가 된다.
//}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@