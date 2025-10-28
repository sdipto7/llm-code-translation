
import java.util.Scanner;

public class atcoder_ABC140_D {
    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
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

    private static String gw() {
        while (true) {
            if (inputScanner.hasNext()) {
                String data = inputScanner.next();
                if (!data.isEmpty()) {
                    return data;
                }
            }
        }
    }

    private static int gi() {
        return Integer.parseInt(gw());
    }
}

