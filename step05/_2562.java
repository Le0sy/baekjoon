package step5;

import java.util.Arrays;
import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int n = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        while (arr[n] != arr2[8]) {
            n++;
        }
        System.out.println(arr[n] + "\n" + (n + 1));*/
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int max = 0;
        int maxindex = 0;
        int tmp;
        while (sc.hasNext()) {
            cnt++;
            tmp = sc.nextInt();
            if (tmp > max) {
                max = tmp;
                maxindex = cnt;
            }
        }
        System.out.println(max + "\n" + maxindex);
    }
}
