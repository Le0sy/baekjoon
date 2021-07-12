package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = strip(br.readLine());
        System.out.println("|" + str + "|");

        int cnt = 0;

        if (str.length() == 0) {
            cnt = -1;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    cnt++;
                }
            }
        }

        System.out.println(cnt + 1);
    }

    static String strip(String s) {
        int i = 0;
        int s_index = 0, e_index = 0;
        try {
            while (s.charAt(i) == ' ') {
                i++;
            }
            s_index = i;
            System.out.println("s : " + s_index);
            i = (s.length() - 1);
            while (s.charAt(i) == ' ') {
                i--;
            }
            e_index = i;
            System.out.println("e : " + e_index);
            return s.substring(s_index, s_index + e_index);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
            return "";
        }
    }
}