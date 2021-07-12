package step3;

import java.io.*;

public class _2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) { // i : tc loop var
            /*
            for (int j = 0; j < N; j++) {
                if(i + j >= N) {
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            */
            for (int j = 0; j < N - i; j++) { // j : space N-1 N-2 N-3 ... 0
                bw.write(" ");
            }
            for (int k = 0; k < i; k++) { // k : *     1 2 3 ... N
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
