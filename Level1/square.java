package Level1;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = a * b;
        int cnt=0;
        for (int i = 0; i < num; i++) {
            cnt++;
            System.out.print("*");
            if(cnt%a == 0){
                System.out.println();
            }
        }
        sc.close();
	}
}
