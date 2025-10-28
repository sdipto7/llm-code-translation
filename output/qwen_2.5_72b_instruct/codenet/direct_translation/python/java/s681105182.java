import java.util.*;
import java.io.*;

public class s681105182 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a_li = new int[N];
        for (int i = 0; i < N; i++) {
            a_li[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a_li);
        int n = a_li[N - 1];
        int dif = Integer.MAX_VALUE;
        int prev_dif = dif;
        int r = 0;
        for (int i = 0; i < N - 1; i++) {
            int a = a_li[i];
            dif = Math.min(Math.abs(n / 2 - a), dif);
            if (dif != prev_dif) {
                r = a;
                prev_dif = dif;
            }
        }
        System.out.println(n + " " + r);
    }
}
