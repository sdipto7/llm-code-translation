
import java.util.*;
import java.io.*;

public class s681105182 {
    static final long INF = (long) Math.pow(10, 18);

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] a_li = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(a_li);

        int n = a_li[N - 1];

        long dif = INF;
        long prev_dif = dif;
        int r = 0;
        for (int i = 0; i < N - 1; i++) {
            int a = a_li[i];
            dif = Math.min(Math.abs(n / 2.0 - a), dif);
            if (dif != prev_dif) {
                r = a;
                prev_dif = dif;
            }
        }

        System.out.println(n + " " + r);
    }
}

