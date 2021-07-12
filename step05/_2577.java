package step5;

import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int result = 1;
        while(sc.hasNext()){
            result *= sc.nextInt();
        }
        for (; result > 0; result/=10) {
            arr[result%10]++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
