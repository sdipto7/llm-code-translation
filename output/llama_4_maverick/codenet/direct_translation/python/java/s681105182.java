
import java.util.Arrays;
import java.util.Scanner;

public class s681105182 {
    private static final long INF = (long) 1e18;
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] aLi = new long[N];
        for (int i = 0; i < N; i++) {
            aLi[i] = sc.nextLong();
        }
        Arrays.sort(aLi);
        long n = aLi[N - 1];
        long dif = INF;
        long prevDif = dif;
        long r = 0;
        for (int i = 0; i < N - 1; i++) {
            dif = Math.min(Math.abs(n / 2 - aLi[i]), dif);
            if (dif != prevDif) {
                r = aLi[i];
                prevDif = dif;
            }
        }
        System.out.println(n + " " + r);
    }
}

