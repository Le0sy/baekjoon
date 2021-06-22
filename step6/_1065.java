package step6;

import java.util.Scanner;

public class _1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(f(sc.nextInt()));


        int n = new java.util.Scanner(System.in).nextInt(), c = 0;
        while (n > 99)
            if (n + n / 100 * 21 == n-- / 10 * 12)
                c++;
        System.out.print(n + c);
    }

    static int f(int N) {
        if (N > 99) {
            int ans = 0;
            for (int i = 100; i <= N; i++) {
                int a = i / 100;
                int b = i / 10 % 10;
                int c = i % 10;
                if ((a - b) == (b - c)) {
                    ans++;
                }
            }
            return ans + 99;
        } else {
            return N;
        }
    }


}
/**
 * 한수를 구하라!
 * 한수는 abc(N)일 때
 * a = N/100
 * b = N/10%10
 * c = N%10
 * a-b == b-c 등차수열!
 * <p>
 * 그럼 각 자리수를 파싱해서 각 자리수를 뺀 값이
 * 동일한지를 확인한다!
 * <p>
 * 1~99까지는 무조건 한수다! 123 이상부터만 확인하면 된다!
 */