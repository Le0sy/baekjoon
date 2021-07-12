package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        String s;
        int cnt = 0;
        int ans = 0;
        int[] arr;
        while((s = br.readLine()) != null) {
            arr = new int[79];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    arr[cnt++]++;
                } else {
                    cnt = 0;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    ans += (i + 1) * arr[i];
                }
            }
            System.out.println(ans);
            ans = 0;
            cnt = 0;
        }

    }
}
