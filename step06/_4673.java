package step6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class _4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] sn = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            if (d(i) <= 10000) {
                sn[d(i)] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!sn[i]) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }

    static int d(int N) {
        int result = N;
        for (int i = N; i > 0; i /= 10) {
            result += i % 10;
        }
        return result;
    }
}
