import java.util.*;
import java.io.*;

public class s681105182 {
    static final long INF = (long)1e18;
    static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] aArr = br.readLine().split(" ");
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = Long.parseLong(aArr[i]);
        }
        Arrays.sort(a);
        long n = a[N - 1];
        long dif = INF;
        long prevDif = dif;
        long r = 0;
        for (int i = 0; i < N - 1; i++) {
            long currentDif = Math.abs(n / 2 - a[i]);
            if (currentDif < dif) {
                dif = currentDif;
                r = a[i];
                prevDif = dif;
            }
        }
        System.out.println(n + " " + r);
    }
}
