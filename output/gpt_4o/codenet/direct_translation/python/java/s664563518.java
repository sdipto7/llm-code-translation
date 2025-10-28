
import java.util.*;
import java.io.*;

public class s664563518 {
    static boolean show_flg = false;
    static final int MOD = 1000000007;
    static final long IINF = 10000000000L;
    static final double inf = Double.POSITIVE_INFINITY;
    static final String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = new String[N];
        int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            s[i] = line[0];
            t[i] = Integer.parseInt(line[1]);
        }

        String X = br.readLine();
        int xi = 0;

        for (int i = 0; i < N; i++) {
            if (s[i].equals(X)) {
                xi = i;
                break;
            }
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (xi < i) {
                ans += t[i];
            }
        }

        System.out.println(ans);
    }
}

