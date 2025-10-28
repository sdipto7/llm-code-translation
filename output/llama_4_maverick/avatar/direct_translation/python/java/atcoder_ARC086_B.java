
import java.io.*;
import java.util.*;

public class atcoder_ARC086_B {
    static final int MOD = (int)1e9 + 7;
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = I();
        int[] a = III();
        int maxVal = 0;
        int maxSign = 0;
        int maxIndex = -1;
        for (int i = 0; i < N; i++) {
            if (Math.abs(a[i]) > maxVal) {
                maxVal = Math.abs(a[i]);
                maxSign = mySign(a[i]);
                maxIndex = i;
            }
        }
        if (maxSign == 0) {
            out.println(0);
        } else if (maxSign == 1) {
            out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                out.println((i + 1) + " " + (i + 2));
            }
        } else {
            out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = N - 1; i > 0; i--) {
                out.println(i + " " + (i + 1));
            }
        }
        out.close();
    }

    static int I() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    static int[] III() throws IOException {
        String[] s = in.readLine().split(" ");
        int n = s.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = Integer.parseInt(s[i]);
        }
        return res;
    }

    static int mySign(int x) {
        return (x > 0) ? 1 : (x < 0) ? -1 : 0;
    }
}

