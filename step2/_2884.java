package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if (M < 45) {
            M += 15;
            H--;
            if (H < 0) {
                H += 24;
            }
        } else {
            M -= 45;
        }

        /*
        int m = (H * 60) + M;
        m -= 45;
        if (m < 0) {
            m += 60 * 24;
        }
        H = m / 60;
        M = m % 60;
        */

        System.out.println(H + " " + M);
    }
}
