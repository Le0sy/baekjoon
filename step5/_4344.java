package step5;

import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            int cnt = 0;
            int N = sc.nextInt();
            int[] arr = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = (double) sum / arr.length;
            for (int j = 0; j < N; j++) {
                if (arr[j] > avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", (double) cnt / arr.length * 100);
        }
    }
}
