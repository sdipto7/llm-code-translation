
import java.util.Arrays;
import java.util.Scanner;

public class s681105182 {
    private static final long INF = (long) 1e18;
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] a_li = new long[N];
        for (int i = 0; i < N; i++) {
            a_li[i] = scanner.nextLong();
        }
        Arrays.sort(a_li);
        long n = a_li[N - 1];
        long dif = INF;
        long prev_dif = dif;
        long r = 0;
        for (int i = 0; i < N - 1; i++) {
            long a = a_li[i];
            dif = Math.min(Math.abs(n / 2 - a), dif);
            if (dif != prev_dif) {
                r = a;
                prev_dif = dif;
            }
        }
        System.out.println(n + " " + r);
    }
}

