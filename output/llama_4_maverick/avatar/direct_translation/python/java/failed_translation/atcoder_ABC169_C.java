
import java.io.*;
import java.util.*;

public class atcoder_ABC169_C {
    static final int P = (int)1e9 + 7;
    static final int INF = (int)1e9 + 10;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        int bInt = (int)(b * 100 + 0.1);
        System.out.println((long)a * bInt / 100);
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}

