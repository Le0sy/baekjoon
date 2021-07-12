package step5;

import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] remainder = new int[42];
        int ans=0;
        while (sc.hasNext()) {
            remainder[sc.nextInt()%42]++;
        }
        for (int i : remainder) {
            if (i > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
