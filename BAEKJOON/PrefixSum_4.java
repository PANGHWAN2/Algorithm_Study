import java.util.Scanner;

public class PrefixSum_4 { // class --> Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[Num + 1];

        arr[0] = 0;
        // i = 1 >> index i = 0 이면 index가 -1
        for (int i = 1; i <= Num; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
            // System.out.println(arr[i]);
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(arr[b] - arr[a - 1]);
        }

    }
}
