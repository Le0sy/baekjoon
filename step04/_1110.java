package step4;

import java.util.Scanner;

public class _1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = N;
        int cnt = 0;
        int L, R;

        do {
            L = tmp / 10;
            R = tmp % 10;

            tmp = (10 * R) + ((L + R) % 10);
            cnt++;
        } while (tmp != N);
        System.out.println(cnt);
    }
}
