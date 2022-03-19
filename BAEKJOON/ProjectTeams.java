package BAEKJOON;

import java.util.Scanner;

public class ProjectTeams {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		long Ability[] = new long[2 * num]; 

		for (int i = 0; i < (2 * num); i++) {
			Ability[i] = scan.nextInt();
		}
	}
}
