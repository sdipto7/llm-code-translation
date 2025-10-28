import java.util.*;
import java.util.Scanner;

public class atcoder_ABC140_D {
    static Iterator<String> inputParser;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inputParser = parser().iterator();
        int MOD = (int)1e9 + 7;
        int N = gi();
        int K = gi();
        String S = gw();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int cur_happy = N - 1 - seg_cnt;
        int ans;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * K;
        }
        System.out.println(ans);
    }

    static Iterable<String> parser() {
        return () -> new Iterator<String>() {
            public boolean hasNext() {
                return true;
            }

            public String next() {
                String[] data = sc.nextLine().split(" ");
                for (String number : data) {
                    if (number.length() > 0) {
                        return number;
                    }
                }
                return "";
            }
        };
    }

    static String gw() {
        return inputParser.next();
    }

    static int gi() {
        return Integer.parseInt(gw());
    }
}
