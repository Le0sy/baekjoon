package step5;

import java.io.IOException;
import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0, max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        double result = (double)sum / arr.length;

        System.out.println(result/max*100);
    }
}
